class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) sum += b;

        long left = 0, right = sum / n;
        long answer = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (canRun(mid, n, batteries)) {
                answer = mid;  // mid works → try longer
                left = mid + 1;
            } else {
                right = mid - 1; // mid doesn't work → try shorter
            }
        }
        return answer;
    }

    private boolean canRun(long time, int n, int[] batteries) {
        long total = 0;

        for (long b : batteries)
            total += Math.min(b, time);  // each battery gives at most time

        return total >= (long)n * time;
    }
}
