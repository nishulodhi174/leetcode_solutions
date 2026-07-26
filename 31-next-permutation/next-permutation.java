class Solution {
    public void nextPermutation(int[] arr) {
        int pivot = -1;
        int idxp = -1;
        int n = arr.length;

        for (int i = n-1; i>0;i--){
            if(arr[i-1] < arr[i]){
                pivot = arr[i-1];
                idxp = i-1;
                break;
            }
        }

        for(int i = n-1;i>0;i--){
            if(idxp == -1){
                reverseArray(arr,idxp+1,n-1);
                return;
            }
            if(arr[i] > pivot ){
                int temp = arr[i];
                arr[i] = pivot;
                arr[idxp] = temp;
                reverseArray(arr,idxp+1,n-1);  
                return; 
            }
        }
    }
    public void reverseArray(int arr[], int s,int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}