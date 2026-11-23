class Solution {
    public boolean search(int[] matrix, int target) {
        int n = matrix.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid] == target) return true;
            if (matrix[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int low = 0, high = n - 1;
        int row = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] < target) {
                row = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (row == -1) return false;

        return search(matrix[row], target);
    }
}
