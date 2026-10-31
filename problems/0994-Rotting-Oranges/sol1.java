// ==========================================================
// 994. Rotting Oranges
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 88%)
// Memory     : 43.7 MB (Beats 87%)
// Link       : https://leetcode.com/problems/rotting-oranges/
// ==========================================================


class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int[][] dir={
            {-1,0},
            {0,-1},
            {0,1},
            {1,0}
        };
        Queue<int[]> q=new LinkedList<>();
                
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                     q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    count++;
                }
            }
        }
        if(count==0) return 0;// no fresh oranges
        int mini=0;
        while(!q.isEmpty()){
            int size=q.size();
            boolean rottedany=false;
            for(int i=0;i<size;i++){
            int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            for(int[] d:dir){
                int nr=row+d[0];
                int nc=col+d[1];
                if(nr>=0&& nc>=0 && nr<n && nc<m && grid[nr][nc]==1){
                    grid[nr][nc]=2;
                    q.add(new int[]{nr,nc});
                    rottedany=true;
                    count--;
                }
            }
            
             }
             if(rottedany){
                mini++;
            }
        }
                
     return count==0?mini:-1;
    }
}