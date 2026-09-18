class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;   
    }

    private void backtrack(List<List<String>> result, List<String> currList, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currList));
            return;
        }

        for (int end = start; end < s.length(); end++ ) {
            if (isPalindrome(s, start, end)) {
                currList.add(s.substring(start, end + 1));
                backtrack(result, currList, s, end + 1);
                currList.remove(currList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
    }
}
