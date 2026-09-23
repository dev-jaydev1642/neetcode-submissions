class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] targetCounts = new int[128];
        for (char c : t.toCharArray()) targetCounts[c]++;

        int left = 0, minLeft = 0, minLength = Integer.MAX_VALUE, requiredMatches = t.length();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            if (targetCounts[rightChar] > 0) requiredMatches--;
            targetCounts[rightChar]--;

            while (requiredMatches == 0) {
                int currWindowSize = right - left + 1;
                if (currWindowSize < minLength) {
                    minLength = currWindowSize;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                targetCounts[leftChar]++;

                if (targetCounts[leftChar] > 0) requiredMatches++;

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}
