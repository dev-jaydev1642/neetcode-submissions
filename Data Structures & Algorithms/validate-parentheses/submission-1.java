class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch =='[') list.add(ch);
            else {
                if (list.isEmpty()) return false;
                
                char lastOpen = list.removeLast();
                if (ch == ')' && lastOpen != '(') return false;
                if (ch == '}' && lastOpen != '{') return false;
                if (ch == ']' && lastOpen != '[') return false;
            }
        }
        return list.isEmpty();
    }
}
