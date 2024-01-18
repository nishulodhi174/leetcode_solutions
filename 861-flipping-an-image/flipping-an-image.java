class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] img = new int[n][n];
        for(int i=0;i<n;i++){
            int j1 = 0;
            for(int j=n-1;j>=0;j--){
                if(image[i][j] == 0){
                    img[i][j1] = 1;
                }else{
                    img[i][j1] = 0;
                }
                j1++;
            }
        }
        return img;
    }
}