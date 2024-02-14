class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }
        int ans[] = new int[nums.length];
        int c= 0;
        for(int i=0 ; i<l1.size();i++){
            ans[c++] = l1.get(i);
            ans[c++] = l2.get(i);
        }
        return ans;
    }
}