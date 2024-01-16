class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;
        for(int i = 0;i<jewels.length();i++){
            hm.put(jewels.charAt(i),1);
        }
        for(int i=0;i<stones.length();i++){
            if(hm.containsKey(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}