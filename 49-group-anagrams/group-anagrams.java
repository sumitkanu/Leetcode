class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> arr = new ArrayList<>();

        for(String str: strs){
            List<String> ordstr = map.getOrDefault(ordered(str), new ArrayList<>());
            ordstr.add(str);
            map.put(ordered(str), ordstr);
        }

        for(String str : map.keySet()){
            arr.add(map.get(str));
        }

        return arr;
    }

    private String ordered(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}