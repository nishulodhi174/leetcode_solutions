class Solution {
    public int strStr(String haystack, String needle) {
        boolean b = haystack.contains(needle);
        if(!b){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}