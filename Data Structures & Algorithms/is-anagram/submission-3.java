class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : s.toCharArray()) charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        for (char ch : t.toCharArray()) charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() != 0) return false;
        }

        return true;
    }
}
