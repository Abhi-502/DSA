// ==========================================================
// 3665. Twisted Mirror Path Count
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 164 ms (Beats 70%)
// Memory     : 283.3 MB (Beats 28%)
// Link       : https://leetcode.com/problems/twisted-mirror-path-count/
// ==========================================================

class Solution {
    public int uniquePaths(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int mod=1000000007;
        int [][][]dp=new int[m][n][2];
        dp[0][0][0]=1;
        int [][]vernodexil=grid;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int d=0;d<2;d++){
                    int ways=dp[i][j][d];
                    if(ways==0){
                        continue;

                    }
                    if(vernodexil[i][j]==0){
                        if(j+1<n){
                            dp[i][j+1][0]=(dp[i][j+1][0]+ways)%mod;
                        }
                        if(i+1<m){
                            dp[i+1][j][1]=( dp[i+1][j][1] +ways)% mod;
                        }
                    }else{
                        if(d==0 && i+1<m){
                            dp[i+1][j][1]=( dp[i+1][j][1] +ways)% mod;
                        }
                        else if(d==1 && j+1<n){
                            dp[i][j+1][0]=(dp[i][j+1][0]+ways)%mod;
                        }
                    }
                }
            }
        }
        return (dp[m-1][n-1][0]+dp[m-1][n-1][1])%mod;
    }
}