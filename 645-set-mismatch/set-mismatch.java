class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i < nums.length ;i++){
            if(hm.containsKey(nums[i])){
                hm.put(-1,nums[i]);
            }else{
                hm.put(nums[i],0);
            }
        }
        int dup = hm.get(-1);
        int missed = getTotal(nums,dup);
        int[] arr = {dup,missed};
        return arr;
    }
    public int getTotal(int nums[],int dup){
        int total1 = 0 , total2 = 0;
        for(int i=0 ; i<nums.length; i++){
            total1 += i+1;
            total2 += nums[i];
        }
        return total1-total2+dup;
    }
}