class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) return false;

        // char[] s1 = s.toCharArray();
        // char[] s2 = t.toCharArray();

        // Arrays.sort(s1);
        // Arrays.sort(s2);

        // return Arrays.equals(s1,s2);

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
        }

        for (var pair : charCount.entrySet()) {
            if (pair.getValue() != 0) return false;
        }

        return true;
    }
}
