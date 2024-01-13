class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length() / 2;
        
        return checkVowel(s.substring(0 , length)) == checkVowel(s.substring(length));
    }

    public static int checkVowel(String str ) {
        int count = 0;
        for (char ch : str.toCharArray())
        {   
           if("AEIOUaeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }
}