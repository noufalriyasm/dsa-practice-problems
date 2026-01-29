package array;

public class BestTimeToBuyAndSell {
    /**
     * Easy-121
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * Example 1:
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     * Example 2:
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transactions are done and the max profit = 0.
     */

    public int maxProfitBruteForceMethod(int[] prices) {    //O(n2) complexity
        int maxProfit = 0;
        if (prices.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < prices.length; i++) {
                for (int j = i + 1; j < prices.length - 1; j++) {
                    if (prices[j] - prices[i] > maxProfit) {
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
            return maxProfit;
        }

    }


    public int maxProfit(int[] prices) {
        if (prices.length==0) {
            return 0;
        }
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int price : prices) {
            if (price < min_price) {
                min_price = price;
            } else {
                if (price - min_price > max_profit) {
                    max_profit = price - min_price;
                }
            }
        }
        return max_profit;


    }
}
