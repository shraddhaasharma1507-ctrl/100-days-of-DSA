class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0; int totalcost=0; int start =0;int currgas =0;
        for (int i=0; i<gas.length; i++){
            totalgas = totalgas+ gas[i];
            totalcost = totalcost + cost[i];
            currgas = currgas + (gas[i]- cost[i]);

            if (currgas<0){
                start = i+1;
                currgas =0;
            }
        }
        return totalgas< totalcost ? -1 : start;
    }
}