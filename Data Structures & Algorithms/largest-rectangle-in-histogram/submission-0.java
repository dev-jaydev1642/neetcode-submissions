class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;

        ArrayList<Integer> stack = new ArrayList<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.getLast()]) {
                int poppedIdx = stack.removeLast();
                int height = heights[poppedIdx];
                int width = stack.isEmpty() ? i : i - stack.getLast() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.addLast(i);
        }

        return maxArea;
    }
}
