class Solution {
    public int maxDepth(String str) {
        int count = 0;
        int max = 0;
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '('){
                s.push('(');
                count++;
                max = Math.max(count,max);
            }else if(str.charAt(i) == ')'){
                s.pop();
                count--;
            }
        }
        return max;
    }
}