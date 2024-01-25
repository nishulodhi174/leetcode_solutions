class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(' ',' ');
        char ch='a';
        for(int i=0 ; i<key.length() ; i++){
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),ch);
                ch++;   
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++){
            sb.append(map.get(message.charAt(i)));
        }
        return sb.toString();
    }
}