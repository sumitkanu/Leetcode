class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        
        for(String s : cpdomains) {
            int count = Integer.parseInt(s.split(" ")[0]);
            String[] domains = s.split(" ")[1].split("\\.");
            // System.out.println(s.split(" ")[1].split(".")[0]);
            String key = "";
            for(int i=domains.length - 1; i >= 0; i--) {
                key = domains[i].concat(key);
                map.put(key , map.getOrDefault(key, 0) + count);
                key = ".".concat(key);
            }
        }

        for(String key : map.keySet()) {
            ans.add(map.get(key).toString().concat(" ").concat(key));
        }

        return ans;
    }
}