class Solution {
    public int maximum69Number (int num) {
        if(num == 9999){
            return 9999;
        }
        int ans = 0;
        String str = Integer.toString(num);
        int[] nums = new int[str.length()];
        for(int i=0 ;i<str.length();i++){
            nums[i] = str.charAt(i) - '0';
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 6){
                nums[i] = 9;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            ans = ans*10+nums[i];
        }
        return ans;
    }
}