// ==========================================================
// 120. Triangle
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 40%)
// Memory     : 45.3 MB (Beats 75%)
// Link       : https://leetcode.com/problems/triangle/
// ==========================================================

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      int n=triangle.size();
      int[][] dp=new int[n][n];
      dp[0][0]=triangle.get(0).get(0);
      for(int i=1;i<n;i++){
        for(int j=0;j<=i;j++){
            int val=triangle.get(i).get(j);
            if(j==0){
                dp[i][j]=dp[i-1][j]+val;
            }
            else if(j==i){
                dp[i][j]=dp[i-1][j-1]+val;
            }
            else{
                dp[i][j]=val+Math.min(dp[i-1][j-1],dp[i-1][j]);
            }
        }
      }
      int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[n-1][j]);
        }

        return ans;
    }
}