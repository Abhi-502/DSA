// ==========================================================
// 63. Unique Paths II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.4 MB (Beats 66%)
// Link       : https://leetcode.com/problems/unique-paths-ii/
// ==========================================================

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if( obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1) continue;
                if(i>0)
                dp[i][j]+=dp[i-1][j];
                if(j>0)
                dp[i][j]+=dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}