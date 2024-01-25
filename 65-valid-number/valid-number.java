class Solution {
    public boolean isNumber(String s) {
        boolean dig=false,e=false,dot =false;
        int cPM = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                dig = true;
            }else if(ch == '+' || ch == '-'){
                if(cPM == 2){
                    return false;
                }if(i > 0 && (s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')){
                    return false;
                }if(i == s.length()-1){
                    return false;
                }
                cPM++;
            }else if(ch == '.'){
                if(e || dot){
                    return false;
                }
                dot = true;
                if(i == s.length()-1 && !dig){
                    return false;
                }
            }else if(ch == 'e' || ch == 'E'){
                if(e || !dig || i == s.length()-1){
                    return false;
                }
                e = true;
            }else{
                return false;
            }
        }
        return true;
    }
}