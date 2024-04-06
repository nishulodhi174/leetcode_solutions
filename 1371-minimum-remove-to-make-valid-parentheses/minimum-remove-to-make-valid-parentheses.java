class Solution {
    public String minRemoveToMakeValid(String s) {
        int opens = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == '(') {
                opens++;
            } else {
                if(opens > 0) {
                    if(s.charAt(i) == ')')
                        opens--;
                } else {
                    if(s.charAt(i) == ')')
                        continue;
                }
            }
            sb.append(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        if(opens > 0) {
            for(int i = sb.length()-1; i >=0 ; i--)  {
                if(sb.charAt(i) == '(' && opens > 0){
                    opens--;
                    continue;
                } 
                res.append(sb.charAt(i));
            }
        } else {
            return sb.toString();
        }
        return res.reverse().toString();
    }
}