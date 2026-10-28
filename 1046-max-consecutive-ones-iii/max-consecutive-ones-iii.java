class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int zeros=0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start;
    }
}

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int res = 0;
//         int zc = 0;
//         int st = 0,en = 0;
//         int idx  = -1;

//         while (en < nums.length){
//             idx++;
//             if(nums[en] == 0 && zc < k){
//                 en++;
//                 zc++;
//             }else if(nums[en] == 1){
//                 en++;
//                 res = Math.max(res,en-st);
//             }else{
//                 if(nums[st] == 0){
//                     zc--;
//                 }
//                 st++;
//                 en = Math.max(en,st);
//             }
//         }
//         return res;
//     }
// }