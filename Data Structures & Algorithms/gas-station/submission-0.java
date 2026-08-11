class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot = 0;
        int res = 0;

        for (int i = 0; i < gas.length; i++) {
            tot += gas[i] - cost[i];

            if (tot < 0) {
                tot = 0;
                res = i + 1;
            }
        }
        int sumgas = 0;
        int sumcost = 0;
        for (int ele : gas) sumgas += ele;
        for (int ele : cost) sumcost += ele;

        if (sumgas < sumcost)
            return -1;

        return res;
    }
}
