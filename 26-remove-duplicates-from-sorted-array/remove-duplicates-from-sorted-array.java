class Solution {
    public int removeDuplicates(int[] nums) {

        int c = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]) nums[c++] = nums[i];
        }
        return c;

        // int count=1;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] != nums[i+1]) count++;
        // }
        // return count;
    }
}