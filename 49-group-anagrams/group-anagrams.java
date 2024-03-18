class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap = new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] x = strs[i].toCharArray();
            Arrays.sort(x);
            String s = new String(x);
            if (hmap.containsKey(s)){
                hmap.get(s).add(strs[i]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                hmap.put(s,list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (String s:hmap.keySet()){
            ans.add(hmap.get(s));
        }
        return ans;
    }
}