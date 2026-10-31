// ==========================================================
// 200. Number of Islands
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 8 ms (Beats 11%)
// Memory     : 51 MB (Beats 94%)
// Link       : https://leetcode.com/problems/number-of-islands/
// ==========================================================

class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int [][]dir={
            {-1,0},{1,0},{0,-1},{0,1}
        };
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(grid[r][c]=='1'){
                    count++;
                    Queue<int[]> q=new LinkedList<>();
                    q.add(new int[]{r,c});
                    grid[r][c]='0';
                    while(!q.isEmpty()){
                        int[] curr=q.poll();
                        int row=curr[0];
                        int col=curr[1];
                        for(int []d:dir){
                            int nr=row+d[0];
                            int nc=col+d[1];
                            if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]=='1'){
                                grid[nr][nc]='0';
                                q.add(new int[]{nr,nc});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}