// ==========================================================
// 74. Search a 2D Matrix
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.5 MB (Beats 94%)
// Link       : https://leetcode.com/problems/search-a-2d-matrix/
// ==========================================================

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int low = 0;
        int high = matrix.length - 1;
        int colLength = matrix[0].length;
        
        // 1. Binary search to find the correct row
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (matrix[mid][0] <= target && target <= matrix[mid][colLength - 1]) {
                return binarysearch(matrix[mid], target); 
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
    
    // 2. Binary search within the chosen row
    public boolean binarysearch(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
