class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch=='['){
                st.push(ch);
                continue;
            }
            if(st.isEmpty()) return false;
            if(ch==')' && st.peek()=='(') st.pop();
           else if(ch=='}' && st.peek()=='{') st.pop();
           else if(ch==']' && st.peek()=='[') st.pop(); 
           else return false;
        }
        return st.isEmpty();
    }
}