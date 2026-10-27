class Solution {
    public double findMaxAverage(int[] nums, int ki) {
        double sum = 0, k = ki;

        for(int i=0;i<ki;i++){
            sum+=nums[i];
        }
        double res = sum/k;

        for(int i=ki;i<nums.length;i++){
            sum = sum-nums[i-ki]+nums[i];
            res = Math.max(res,(sum/k));
        }

        return res;

    }
}