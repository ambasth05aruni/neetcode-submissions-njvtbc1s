class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Steps:
        // 1. Sort the first string
        // 2. then  
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);


            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}
