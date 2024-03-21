class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        String str = s.toLowerCase();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0 ; i<str.length() ; i++){
            if('a' <= str.charAt(i) && str.charAt(i)<= 'z'){
                list.add(str.charAt(i));
            }
            if('0' <= str.charAt(i) && str.charAt(i)<= '9'){
                list.add(str.charAt(i));
            }
        }
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i) != list.get(list.size()-i-1)){
                return false;
            }else if(i > list.size()-i-1){
                return true;
            }
        }
        return true;
    }
}