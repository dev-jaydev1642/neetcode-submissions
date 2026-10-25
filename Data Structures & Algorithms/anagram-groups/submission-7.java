class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>(); 

        for (String s : strs) {
            char[] sort = s.toCharArray();
            Arrays.sort(sort);
            String sortString = new String(sort);
            if (!map.containsKey(sortString)) map.put(sortString, new ArrayList<>());
            map.get(sortString).add(s); 
        }

        return new ArrayList<>(map.values());
    }
}
