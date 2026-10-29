// ==========================================================
// 11. Container With Most Water
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 83%)
// Memory     : 76.6 MB (Beats 98%)
// Link       : https://leetcode.com/problems/container-with-most-water/
// ==========================================================

class Solution {
    public int maxArea(int[] heights) {
       int l=0,r=heights.length-1,maxarea=0;
       while(l<r){
        int curr=(r-l)*Math.min(heights[l],heights[r]);
        maxarea=Math.max(maxarea,curr);
        if(heights[l]<heights[r]) l++;
        else r--;
       }
       return maxarea;
    }

}