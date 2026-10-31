// ==========================================================
// 64. Minimum Path Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 23%)
// Memory     : 49.4 MB (Beats 98%)
// Link       : https://leetcode.com/problems/minimum-path-sum/
// ==========================================================

class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp= new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                int top=Integer.MAX_VALUE;
                int left=Integer.MAX_VALUE;
                if(i>0){
                    top=dp[i-1][j];
                }
                if(j>0){
                    left=dp[i][j-1];
                }
                dp[i][j]=grid[i][j] +Math.min(top,left);
            }
        }
        return dp[m-1][n-1];
    }
}