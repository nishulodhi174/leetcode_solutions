class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Set<Integer>> counts = new TreeMap<Integer, Set<Integer>>();
        Map<Integer, Integer> items = new HashMap<Integer, Integer>();
        int result[] = new int[k];
        
        for(int i = 0; i < nums.length; i++){
            if (!items.containsKey(nums[i])){
                items.put(nums[i], 0);
            }
            items.put(nums[i], items.get(nums[i]) + 1);
        }
        for(Integer num : items.keySet()){
            Integer temp = items.get(num);
            if(!counts.containsKey(temp)){
                counts.put(temp, new HashSet<Integer>());
            }
            counts.get(temp).add(num);
        }
        int count = 0;
        while(count < k){
            for (Integer element : counts.get(counts.lastKey())){
                result[count] = element;
                count++;
            }
            counts.pollLastEntry();
        }
        return result;
    }
}