class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> map1 = new HashMap<>();
        HashMap<Integer,Boolean> map2 = new HashMap<>();
        for(int k : nums1){
            map1.put(k,true);
        }
        for(int k : nums2){
            map2.put(k,true);
        }
        Stack<Integer> s = new Stack<>();        
        for(int k : map1.keySet()){
            if(map2.containsKey(k)){
                s.push(k);
            }
        }
        int[] ans = new int[s.size()];
        int i=0;
        while(!s.isEmpty()){
            ans[i++]= s.pop();
        }
        return ans;
    }
}