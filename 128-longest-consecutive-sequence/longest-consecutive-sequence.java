class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        int maxCount = 0;
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]+1 == nums[i+1]){
                count++;
            }else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                count = 0;
            }
            maxCount = Math.max(maxCount,count);
        }
        return ++maxCount;
    }
}