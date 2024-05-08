class Solution {
    public int[] twoSum(int[] n, int target) {
        int[] ans = new int[2];
        int i = 0, j = n.length-1;
        while(i<j){
            if(n[i] + n[j] < target){
                i++;
            }else if(n[i] + n[j] > target){
                j--;
            }else{
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
}