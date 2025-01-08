package work;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // 文件路径
        String filePath = "D:\\txt\\readme.txt";

        // 使用try-with-resources语句确保资源被正确关闭
        try (FileReader fileReader = new FileReader(new File(filePath))) {
            int character;

            // 逐个字符读取文件内容
            while ((character = fileReader.read()) != -1) {
                // 将字符输出到控制台
                System.out.print((char) character);
            }
        } catch (IOException e) {
            // 捕获并打印可能发生的IOException
            e.printStackTrace();
        }
    }
}