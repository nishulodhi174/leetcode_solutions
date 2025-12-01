class Solution {
    public long maxRunTime(int n, int[] arr) {
        long l = 0;
        long h = 0;
        for (int a : arr) h += a;

        h /= n;  

        long ans = 0;

        while (l <= h) {
            long mid = l + (h - l) / 2;

            long total = 0;
            for (int a : arr) {
                total += Math.min((long)a, mid);
            }

            if (total >= mid * (long)n) {
                ans = mid;     
                l = mid + 1;    
            } else {
                h = mid - 1;   
            }
        }

        return ans;
    }
}
