public class Solution {
    public boolean winnerOfGame(String c) {
        int a = 0;
        int b = 0;
        for (int i = 1; i < c.length() - 1; i++) {
            char curr = c.charAt(i);
            char prev = c.charAt(i - 1);
            char next = c.charAt(i + 1);
            if (curr == 'A' && prev == 'A' && next == 'A')
                a++;
            else if (curr == 'B' && prev == 'B' && next == 'B')
                b++;
        }
        return a > b;
    }
}