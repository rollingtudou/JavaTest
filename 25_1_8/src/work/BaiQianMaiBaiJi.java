package work;

public class BaiQianMaiBaiJi {
    public static void main(String[] args) {
        // 公鸡、母鸡、小鸡的数量
        int rooster = 0, hen = 0, chick = 0;

        // 循环遍历所有可能的公鸡数量
        for (rooster = 0; rooster <= 20; rooster++) { // 公鸡最多20只，因为5*20=100
            // 循环遍历所有可能的母鸡数量
            for (hen = 0; hen <= 33; hen++) { // 母鸡最多33只，因为3*33=99
                // 计算小鸡的数量
                chick = 100 - rooster - hen;
                // 检查是否满足条件：公鸡5元，母鸡3元，小鸡3只1元，总共100元
                if (5 * rooster + 3 * hen + chick / 3 == 100 && chick % 3 == 0) {
                    System.out.println("公鸡: " + rooster + " 只, 母鸡: " + hen + " 只, 小鸡: " + chick + " 只");
                }
            }
        }
    }
}