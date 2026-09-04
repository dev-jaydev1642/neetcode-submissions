class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);
            count += expand(s, i, i + 1);
        }

        return count;
    }

    private int expand(String s, int left, int right) {
        int palindromeFound = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            palindromeFound++;
            left--;
            right++;
        }

        return palindromeFound;
    }
}
