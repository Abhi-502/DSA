// ==========================================================
// 733. Flood Fill
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 14%)
// Memory     : 46.4 MB (Beats 80%)
// Link       : https://leetcode.com/problems/flood-fill/
// ==========================================================

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int newColor=image[sr][sc];
        if(newColor==color) return image;
        int n=image.length;
        int m=image[0].length;
        //int count=0;
        int [][]dir={
            {-1,0},{0,-1},{1,0},{0,1}
        };
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc]=color;
       
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            for(int []d:dir){
                int nr=row+d[0];
                int nc=col+d[1];
                if(nr>=0 && nc>=0 && nr<n && nc<m && image[nr][nc]==newColor){
                    image[nr][nc]=color;
                    q.add(new int[]{nr,nc});
                }
            }
        }
                
        
        return image;
    }   
}