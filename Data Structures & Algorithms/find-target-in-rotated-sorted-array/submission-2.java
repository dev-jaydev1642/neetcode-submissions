class Solution {
    public int search(int[] a, int target) {
        int l = 0, h = a.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (target == a[mid]) return mid;

            if (a[l] <= a[mid]) {
                if (target >= a[l] && target < a[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > a[mid] && target <= a[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}
