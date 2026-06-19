class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int c=0,profit=0;
        int min=prices[0];
        for(int i=0;i<n;i++){
            c=prices[i]-min;
            profit=Math.max(c,profit);
            min=Math.min(prices[i],min);
        }
        return profit;
    }
}