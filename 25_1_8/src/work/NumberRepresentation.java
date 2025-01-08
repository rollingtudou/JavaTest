package work;

// 编写程序，将100用二进制、八进制、十六进制形式表示，分别赋值给整型变量a、b、c，并输出三个变量的值。
public class NumberRepresentation {
    public static void main(String[] args) {
        int a = Integer.parseInt(Integer.toBinaryString(100)); // 将100转换为二进制字符串，再转换为整数
        int b = Integer.parseInt(Integer.toOctalString(100));   // 将100转换为八进制字符串，再转换为整数
        int c = Integer.parseInt(Integer.toHexString(100));     // 将100转换为十六进制字符串，再转换为整数

        // 输出转换后的整数值
        System.out.println("100 in binary: " + a);
        System.out.println("100 in octal: " + b);
        System.out.println("100 in hexadecimal: " + c);
    }
}