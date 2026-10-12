class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++) {

            char currChar = s.charAt(right);    

            if(map.containsKey(currChar)) {
                left = Math.max(left, map.get(currChar) + 1);
            }

            map.put(currChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
        
    }
}
