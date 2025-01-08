package work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentInfoQuery {
    public static void main(String[] args) {
        // 数据库URL，用户名和密码（根据你的数据库配置进行修改）
        String url = "jdbc:mysql://localhost:3306/stuDB";
        String user = "root";
        String password = "password";

        // 学生姓名
        String studentName = "张三"; // 假设我们要查询的学生姓名

        // SQL查询语句
        String query = "SELECT * FROM student WHERE stuName = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // 创建PreparedStatement对象
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // 设置查询参数
                preparedStatement.setString(1, studentName);

                // 执行查询
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // 检查是否有结果
                    if (resultSet.next()) {
                        // 获取并打印学生信息
                        int stuId = resultSet.getInt("stuId");
                        String name = resultSet.getString("stuName");
                        int age = resultSet.getInt("age");
                        String major = resultSet.getString("major");
                        String dept = resultSet.getString("dept");

                        System.out.println("Student ID: " + stuId);
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Major: " + major);
                        System.out.println("Department: " + dept);
                    } else {
                        System.out.println("No student found with the name " + studentName);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while querying the database.");
            e.printStackTrace();
        }
    }
}