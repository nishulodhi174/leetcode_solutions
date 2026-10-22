class Solution {
    public String reverseVowels(String s) {
        int st = 0;
        int en = s.length()-1;

        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU";

        while(st<en){
            if(vowels.indexOf(sb.charAt(st)) == -1){
                st++;
            }else if(vowels.indexOf(sb.charAt(en)) == -1){
                en--;
            }
            else{
                char temp = sb.charAt(st);
                sb.setCharAt(st,sb.charAt(en));
                sb.setCharAt(en,temp);

                st++;
                en--;
            }
        }
        return sb.toString();
    }
}