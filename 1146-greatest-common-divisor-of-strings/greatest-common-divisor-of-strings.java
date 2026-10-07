class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int max = Math.max(str1.length(),str2.length());
        int min = Math.min(str1.length(),str2.length());

        while (min > 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }

        return str1.substring(0, max);
    }
}