class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
       // Step 1: Build frequency map
        for(int i=0; i<nums.length;i++){
            if(!mapp.containsKey(nums[i])){
            mapp.put(nums[i],1);
            }
            mapp.put(nums[i], mapp.get(nums[i]) + 1);
        }
         // Step 2: Get all keys
        List<Integer> keys = new ArrayList<>(mapp.keySet());
   // Step 3: Sort keys based on frequency (descending)
        Collections.sort(keys, (a, b) -> mapp.get(b) - mapp.get(a));
 // Step 4: Pick top k elements
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = keys.get(i);
        }

        return result;
       
        
    }
}
