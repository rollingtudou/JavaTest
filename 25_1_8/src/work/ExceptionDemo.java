package work;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] a = new int[10];
        int m;
        Scanner scan = new Scanner(System.in);

        try {
            a[10] = 123; // 这行代码将抛出数组下标越界异常，因为数组索引从0到9
            m = scan.nextInt();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("数组下标越界异常: " + e.toString());
        } catch (InputMismatchException ime) {
            System.out.println("输入格式异常: " + ime.toString());
        } finally {
            System.out.println("over....");
        }

        System.out.println("主方法运行结束!!");
    }
}