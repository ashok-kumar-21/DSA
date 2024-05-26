class Solution {
    public int maxProfit(int[] prices) {
       int costPrice = prices[0];
       int maximumProfit = 0;
       for(int i=1; i<prices.length; i++){
        maximumProfit = Math.max(maximumProfit, (prices[i]-costPrice));
        costPrice = Math.min(prices[i], costPrice);
       }
       return maximumProfit;
    }
}
