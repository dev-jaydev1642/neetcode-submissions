class Solution {
    private static final String[] KEYPAD = {"" ,"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;

        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder curr, String digits, int index) {
        if (index == digits.length()) {
            result.add(curr.toString());
            return;
        }

        char digitChar = digits.charAt(index);
        String letters = KEYPAD[digitChar - '0'];

        for (int i = 0; i < letters.length(); i++) {
            curr.append(letters.charAt(i));
            backtrack(result, curr, digits, index + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
