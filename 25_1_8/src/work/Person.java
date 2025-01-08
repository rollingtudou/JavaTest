package work;

public class Person {
    // 成员变量
    private String name; // 姓名
    private String sex;  // 性别
    private int age;     // 年龄

    // 构造方法，用于初始化对象的属性
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // speak() 方法，用于输出个人信息
    public void speak() {
        System.out.println("姓名: " + name + ", 性别: " + sex + ", 年龄: " + age);
    }

    // getter 和 setter 方法，用于访问和修改成员变量的值
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 主函数，用于演示Person类的使用
    public static void main(String[] args) {
        // 创建Person对象
        Person person = new Person("张三", "男", 30);
        // 调用speak()方法输出信息
        person.speak();
    }
}