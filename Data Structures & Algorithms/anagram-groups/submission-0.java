class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedSignature = new String(charArr);

            if (!map.containsKey(sortedSignature)) {
                map.put(sortedSignature, new ArrayList<>());
            }

            map.get(sortedSignature).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
