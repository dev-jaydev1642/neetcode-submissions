class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) return 0;

        int[] counts = new int[26];
        int maxLength = 0;
        int maxFrequency = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            counts[currChar - 'A']++;

            maxFrequency = Math.max(maxFrequency, counts[currChar - 'A']);

            while ((right - left + 1) - maxFrequency > k) {
                counts[s.charAt(left++) - 'A']--;
            } 

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
