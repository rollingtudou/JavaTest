package work;

public class GuoQiGame {
    public static void main(String[] args) {
        String[] players = {"甲", "乙", "丙", "丁"}; // 定义玩家数组
        int currentNumber = 1; // 起始报数
        int currentPlayerIndex = 0; // 当前玩家索引

        while (currentNumber <= 100) { // 游戏限制在1到100之间
            boolean shouldSkip = isSeven(currentNumber); // 检查是否需要喊“过”
            if (!shouldSkip) {
                System.out.println(players[currentPlayerIndex] + " 报数: " + currentNumber);
            } else {
                System.out.println(players[currentPlayerIndex] + " 喊“过”");
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.length; // 切换到下一个玩家
            currentNumber++; // 增加报数
        }
    }

    // 检查数字是否包含7或者是7的倍数
    private static boolean isSeven(int number) {
        String numberStr = Integer.toString(number);
        return numberStr.contains("7") || number % 7 == 0;
    }
}
