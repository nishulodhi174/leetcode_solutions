class Solution {
    public int longestSubarray(int[] nums) {

        int zeros =0,start = 0, end = 0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>1){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start-1;
        
    }
}