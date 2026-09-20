class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean matchX = false, matchY = false, matchZ = false;

        for (int[] t : triplets) {
            if (t[0] > target[0] || t[1] > target[1] || t[2] > target[2]) {
                continue;
            }

            if (t[0] == target[0]) matchX = true;
            if (t[1] == target[1]) matchY = true;
            if (t[2] == target[2]) matchZ = true;
        }

        return matchX && matchY && matchZ;
    }
}
