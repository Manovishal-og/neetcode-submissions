class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i  = 1 ; i < prices.length ; i++){
            buy = prices[i-1];
            int sell = prices[i];
            if( sell - buy > 0 )profit += sell - buy ;
        }
        return profit;
    }
}