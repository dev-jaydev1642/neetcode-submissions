class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        int[] lastSeen = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastSeen[s.charAt(i) - 'a'] = i;
        }

        int end = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastSeen[s.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }
}
