class Solution {
    public int maxArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        
        int l = 0, r = heights.length - 1;
        int res = 0;

        while (l < r) {
            int width = r - l;
            int height = Math.min(heights[l], heights[r]);
            res = Math.max(res, height * width);

            if (heights[l] < heights[r]) l++;
            else r--;
        }

        return res;
    }
}
