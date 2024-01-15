class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(int i = 0 ;i<operations.length;i++){
            if("--X".equals(operations[i]) || "X--".equals(operations[i])){
                sum--;
            }if("++X".equals(operations[i]) || "X++".equals(operations[i])){
                sum++;
            }
        }
        return sum;
    }
}