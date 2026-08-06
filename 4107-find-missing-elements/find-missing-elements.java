class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int min=nums[0], max = nums[0];

        for(int i = 0 ; i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            map.put(nums[i],nums[i]);
        }

        for(int i = min+1;i<max;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        
        return list;        
    }
}