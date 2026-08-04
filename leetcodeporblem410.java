class Solution {
    public int splitArray(int[] nums, int k) {
        int st = 0;
        int end = 0;
        for (int num : nums) {
            st = Math.max(st, num);
            end += num;
        }
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (minimized(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public boolean minimized(int[] nums, int k, int maxSum) {
        int subarr = 1;
        int currSum = 0;
        for (int num : nums) {
            if (currSum + num > maxSum) {
                currSum = num;
                subarr++;
            } else {
                currSum += num;
            }
        }
        return subarr <= k;
    }
}