class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums[i] = -1;
                count++;
            }
        }
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != -1){
                nums[idx++] = nums[i];
            }
        }
        return nums.length - count;
    }
}