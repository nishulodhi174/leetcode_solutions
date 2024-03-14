class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            String key = generateKey(word);

            List<String> words = groups.getOrDefault(key, new ArrayList());
            words.add(word);
            groups.put(key, words);
        }

        for (String groupKey : groups.keySet()) {
            result.add(groups.get(groupKey));
        }

        return result;
    }

    private String generateKey(String word) {
        char[] chars = new char[26];

        for (Character c : word.toCharArray()) {
            int index = c - 'a';
            chars[index]++;
        }

        return String.valueOf(chars);
    }
}