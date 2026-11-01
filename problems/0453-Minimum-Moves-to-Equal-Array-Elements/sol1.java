// ==========================================================
// 453. Minimum Moves to Equal Array Elements
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 94%)
// Memory     : 46.7 MB (Beats 85%)
// Link       : https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
// ==========================================================

class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }int sum=0;
        for(int num:nums){
            sum+=num-min;
        }
        return sum;
    }
}