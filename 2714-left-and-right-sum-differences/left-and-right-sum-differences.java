class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        int ls = nums[0];
        int rs = nums[nums.length-1];
        int[] container = new int[nums.length];
        lsum[0] = 0;
        rsum[nums.length-1] = 0;
        for(int i = 1 ; i<nums.length ; i++){
            lsum[i] = ls;
            ls = ls+nums[i];
        }
        for(int i = nums.length-2; i>=0 ; i--){
            rsum[i] = rs;
            rs = rs+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int ans = lsum[i] - rsum[i];
            if(ans < 0){
                ans = ans*-1;
            }
            container[i] = ans;
        }
        return container;
    }
}