class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> frequencies = new HashSet<>();
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int count : counts.values()) {
            if (!frequencies.add(count)) {
                return false; // Duplicate frequency found
            }
        }

        return true; // All frequencies are unique
    }
}
