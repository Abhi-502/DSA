// ==========================================================
// 53. Maximum Subarray
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 80.2 MB (Beats 10%)
// Link       : https://leetcode.com/problems/maximum-subarray/
// ==========================================================

class Solution {
    public int maxSubArray(int[] nums) {
        int cnt=0;
        int maxcnt=Integer.MIN_VALUE;
        for(int num:nums){
            cnt+=num;
            maxcnt=Math.max(cnt,maxcnt);
            if(cnt<0){
                cnt=0;
            }
        }
        return maxcnt;
    }
}