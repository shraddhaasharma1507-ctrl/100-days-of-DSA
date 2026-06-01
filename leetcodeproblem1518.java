class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            total++;
            empty = empty - numExchange + 1;
        }

        return total;
    }
}