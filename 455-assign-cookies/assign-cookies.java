class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int z=0;
        int m=0;
        while(z<s.length && m<g.length) {
            if(s[z]>=g[m]){
                count++;
                z++;
                m++;
            }else{
                z++;
            }
        }
        return count;
    }
}