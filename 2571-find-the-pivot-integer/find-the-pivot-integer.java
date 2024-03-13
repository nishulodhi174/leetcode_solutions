class Solution {
    public int pivotInteger(int n) {
        int ans[] = new int[n + 1];

        for ( int i=1; i<n+1; i++){
            ans[i] = ans[i-1] + i;
        }

        for(int i=1 ; i<n+1;i++){
            if(ans[i] == ans[n] - ans[i-1]){
                return i;
            }
        }
        return -1;
    }
}
