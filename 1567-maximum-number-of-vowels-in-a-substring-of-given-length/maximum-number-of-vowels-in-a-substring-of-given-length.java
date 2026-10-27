class Solution {
    public int maxVowels(String s, int k) {

        int c = 0, maxc = 0;
        for(int i=0 ; i<k ; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        maxc = c;

        for(int i = k;i<s.length();i++){
            char ch = s.charAt(i);
            char ph = s.charAt(i-k);
            if (ph == 'a' || ph == 'e' || ph == 'i' || ph == 'o' || ph == 'u') {
                c--;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
            maxc = Math.max(maxc,c);
            if(maxc == k)return maxc;
        }

        return maxc;
        
    }
}