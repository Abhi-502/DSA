// ==========================================================
// 462. Minimum Moves to Equal Array Elements II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 10 ms (Beats 84%)
// Memory     : 46.5 MB (Beats 92%)
// Link       : https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
// ==========================================================

class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        long moves=0;
      // int min=Integer.MAX_VALUE;
       // int sum=0;
        for(int num:nums){
           moves+=Math.abs((long)num-median);
        }
        return (int)moves; 
    }
}