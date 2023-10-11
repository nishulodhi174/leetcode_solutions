class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) 
            return s;
            
        int diff1 = numRows + (numRows - 2); 
        
        int diff2 = 0; 
        
        StringBuilder st = new StringBuilder();
        
        for(int row=0;row<numRows;row++){
            int col = row;
            boolean turn = true;
            while(col < s.length()){
                st.append(s.charAt(col));
                if(turn){
                    col += (diff1 == 0) ? diff2 : diff1;
                    
                    turn = !turn;
                }else{
                    col += (diff2 == 0) ? diff1 : diff2;
                    turn = !turn;
                }
            }
            diff1 -= 2;
            diff2 += 2;
        }
        return st.toString();
    }
}