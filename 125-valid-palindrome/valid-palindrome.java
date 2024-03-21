class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char start=s.charAt(left);
            char end=s.charAt(right);
            
            if(!isAlphanumeric(start)){
                left++;
                continue;
            }
            if(!isAlphanumeric(end)){
                right--;
                continue;
            }

            if(start!=end) return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean isAlphanumeric(char c){
        return (c>='a' && c<='z') || (c>='0' && c<='9');
    }
}