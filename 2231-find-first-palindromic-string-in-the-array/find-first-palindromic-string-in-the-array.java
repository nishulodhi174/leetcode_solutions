class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            boolean ans = false;
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j) != words[i].charAt(words[i].length()-1-j)){
                    ans = false;
                    break;
                }
                ans = true;
            }
            if(ans){
                return words[i];
            }
        }
        return "";
    }
}