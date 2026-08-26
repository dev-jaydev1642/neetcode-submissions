class Solution {
    // public boolean minEatRate(int[] piles, int mid, int hrs) {
    //     int minHrs = 0;

    //     for (int i = 0; i < piles.length; i++) {
    //         minHrs += (piles[i] + mid - 1) / mid;
    //     }

    //     return minHrs <= hrs;
    // }

    public boolean minEatHrs(int[] piles, int mid, int hrs) {
        int minHrs = 0;

        for (int i = 0; i < piles.length; i++) {
            minHrs += (piles[i] + mid - 1) / mid;
        }

        return minHrs <= hrs;
    }

    public int minEatingSpeed(int[] piles, int hrs) {
        // int l = 1, h = Arrays.stream(piles).max().getAsInt();
        // int res = h;

        // while (l <= h) {
        //     int mid = l + (h - l) / 2;
        //     if (minEatRate(piles, mid, hrs)) {
        //         res = mid;
        //         h = mid - 1;
        //     } else {
        //         l = mid + 1;
        //     }   
        // }

        // return res;

        int l = 1, h = Arrays.stream(piles).max().getAsInt();

        int res = h;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (minEatHrs(piles, mid, hrs)) {
                res = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
}
