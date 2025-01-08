package work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingStreams {
    public static void main(String[] args) {
        String sourcePath = "D:\\image\\IMG01.jpg"; // 源文件路径
        String destinationPath = "E:\\copy_of_IMG01.jpg"; // 目标文件路径

        try (FileInputStream fileInputStream = new FileInputStream(sourcePath);
             FileOutputStream fileOutputStream = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024]; // 缓冲区
            int length;

            // 从源文件读取数据到缓冲区，然后写入目标文件
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}