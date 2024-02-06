class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(s.length() == 0){
            return t.charAt(0);
        }
        for(int i=0;i<ch2.length-1;i++){
            if(ch1[i] != ch2[i]){
                return ch2[i];
            }
        }
        return ch2[ch2.length - 1];
    }
}