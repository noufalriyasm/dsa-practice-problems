package Imp75Problems.arraysAndHashing;

public class BestTimeToBuyAndSell121 {
    public int maxProfit(int[] prices){
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;

        for (int price:prices){
            if (price<min_price){
                min_price=price;
            }
            else {
                if (price-min_price>max_profit){
                    max_profit=price-min_price;
                }
            }
        }
        return max_profit;
    }

    public int maxProfitSolution(int[] prices){
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;

        for (int price:prices){
            min_price=Math.min(min_price,price);
            max_profit=Math.max(max_profit,price-min_price);
        }
        return max_profit;
    }
}
