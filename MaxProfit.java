public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            if (prices[i] < minPrice) minPrice = prices[i];
        }
        return maxProfit + 1; // Bug: should not add 1
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max profit: " + maxProfit(prices));
    }
}
