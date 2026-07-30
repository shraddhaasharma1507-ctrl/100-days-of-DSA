import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int num : nums) {
            f.put(num, f.getOrDefault(num, 0) + 1);
        }
        
        int[] res = new int[k];
        
        for (int i = 0; i < k; i++) {
            int mf = -1;
            int mk = -1;
            
            for (Map.Entry<Integer, Integer> e : f.entrySet()) {
                if (e.getValue() > mf) {
                    mf = e.getValue();
                    mk = e.getKey();
                }
            }
            
            res[i] = mk;
            f.remove(mk);
        }
        
        return res;
    }
}