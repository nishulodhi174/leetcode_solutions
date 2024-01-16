class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = nums[i];
            arr2[i] = nums[i+n];
        }
        int i = 0 , j = 0 ;
        while(i<n){
            nums[j] = arr1[i];
            j++;
            nums[j] = arr2[i];
            j++;
            i++;
        }
        return nums;
    }
}