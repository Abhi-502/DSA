// ==========================================================
// 3736. Minimum Moves to Equal Array Elements III
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 30%)
// Memory     : 46.2 MB (Beats 69%)
// Link       : https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/
// ==========================================================

class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==1) return 0;
        int max=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
        }
        int sum=0;
        for(int num:nums){
            sum+=max-num;
        }
        return sum;
    }
}