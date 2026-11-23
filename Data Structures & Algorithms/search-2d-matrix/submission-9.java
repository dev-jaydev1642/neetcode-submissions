class Solution {
    public boolean search(int[] row, int target) {
        int l = 0, h = row.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (row[mid] == target) return true;
            else if (row[mid] < target) l = mid + 1;
            else h = mid - 1;
        }

        return false;
    }

   
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int l = 0, h = n - 1;
        int row = -1;
    
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (matrix[mid][0] == target) return true;

            if (matrix[mid][0] < target) {
                row = mid;
                l = mid + 1;
            } else {
                h = mid - 1; 
            }
        }

        if (row == -1) return false;

        return search(matrix[row], target);
    }
}
