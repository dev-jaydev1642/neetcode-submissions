class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int totalLength = n + m;

        int p1 = 0, p2 = 0;

        int prev = 0, curr = 0;

        for (int i = 0; i <= totalLength / 2; i++) {
            prev = curr;

            if (p1 < n && (p2 >= m || nums1[p1] <= nums2[p2])) {
                curr = nums1[p1];
                p1++; 
            } else {
                curr = nums2[p2];
                p2++;
            }
        } 

        if (totalLength % 2 == 0) {
            return (double) (prev + curr) / 2.0;
        } else {
            return (double) curr;
        }
    }
}
