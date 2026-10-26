class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') list.add(ch);
            else {
                if (list.isEmpty()) return false;
                char last = list.removeLast();
                if (ch == ')' && last != '(') return false;
                if (ch == '}' && last != '{') return false;
                if (ch == ']' && last != '[') return false;
            }
        }

        return list.isEmpty();
    }
}
