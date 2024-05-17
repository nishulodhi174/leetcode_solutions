class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i=0;i<prices.length-1;i++){
            if((prices[i]+prices[i+1]) == money){
                return 0;
            }else if((prices[i]+prices[i+1]) < money){
                return money - (prices[i]+prices[i+1]);
            }
        }
        return money;
    }
}