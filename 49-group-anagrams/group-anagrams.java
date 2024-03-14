class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String newStr = new String(ch);

            if(map.containsKey(newStr)){
                map.get(newStr).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(newStr,list);
            }            
        }
        return new ArrayList<>(map.values());
    }
}