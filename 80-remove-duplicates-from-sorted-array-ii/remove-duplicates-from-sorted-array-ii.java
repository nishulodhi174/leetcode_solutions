class Solution {
    public int removeDuplicates(int[] nums) {

        int count =0;
        int idx = 0;

        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 0;
            }
            if(count < 2){
                list.add(nums[i]);
            }
        }
        for(int i:list){
            nums[idx++] = i;
        }

        return list.size();
    }
}