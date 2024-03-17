class Solution {
    public int[] twoSum(int[] nums, int target) { 
        for(int i = 0;i < nums.length - 1; i++ ){
            for(int j=i+1; j < nums.length; j++ ){                
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
                if(nums[nums.length-i-1] + nums[nums.length-j-1] == target){
                    return new int[]{nums.length-j-1, nums.length-i-1};
                }                
            }
        }
        return null;
    }
}