class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        sum = happiness[happiness.length-1];
        k--;
        int i=happiness.length-2;
        int iter = 1;

        while(k > 0 && i >= 0){
            if((happiness[i] - iter) > 0){
                sum = sum+(happiness[i] - iter);
            }else{
                break;
            }
            k--;
            i--;
            iter++;
        }
        return sum;
    }
}