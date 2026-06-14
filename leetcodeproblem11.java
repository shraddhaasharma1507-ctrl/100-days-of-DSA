class Solution {
    public int maxArea(int[] height) {
        int current_water=0;
        int max_water =0;
        int i =0;
        int j = height.length-1;
        while (i<j){
            current_water = (j-i)*Math.min(height[i], height[j]);
            max_water = Math.max(max_water, current_water);

            if (height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return max_water;
    }
}