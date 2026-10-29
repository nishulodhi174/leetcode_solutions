class Solution {
    public int longestSubarray(int[] nums) {

        int zc = 0;
        int st = 0, en = 0;

        while(en < nums.length){
            if(nums[en] == 0)
                zc++;
            
            en++;
            if(zc>1){
                if(nums[st] == 0){
                    zc--;
                }
                st++;
            }
        }

        return en-st-1;
        
    }
}