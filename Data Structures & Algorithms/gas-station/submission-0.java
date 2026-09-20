class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        int currTank = 0;
        int startingStation = 0;

        for (int i = 0 ; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];

            currTank += gas[i] - cost[i];

            if (currTank < 0) {
                currTank = 0;
                startingStation = i + 1;

            }
        }

        return totalGas >= totalCost ? startingStation : -1;
    }
}
