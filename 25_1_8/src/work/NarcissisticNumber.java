package work;

// 水仙花数
public class NarcissisticNumber {
    public static void main(String[] args) {
        // 遍历100到999之间的所有数字
        for (int num = 100; num < 1000; num++) {
            int hundreds = num / 100; // 百位数字
            int tens = (num / 10) % 10; // 十位数字
            int ones = num % 10; // 个位数字

            // 判断是否为水仙花数
            if (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3) == num) {
                System.out.println(num); // 输出水仙花数
            }
        }
    }
}