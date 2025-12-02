class Solution {
    public int maxProfit(int[] prices) {

        int minp = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            minp = Math.min(minp,prices[i]);
            profit = Math.max(profit,prices[i]-minp);
        }

        return profit;



    //     int min = prices[0];
    //     int maxd =0;
    //     for (int i=0;i<prices.length-1;i++){
    //         for(int j=i+1;j<prices.length;j++){
    //             if(prices[i] < prices[j]){
    //                 min = prices[i];
    //             }
    //             maxd = Math.max(maxd,prices[j]-prices[i]);
    //         }
    //     }
    //     return maxd;
    }
}