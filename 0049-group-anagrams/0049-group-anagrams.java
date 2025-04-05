class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}