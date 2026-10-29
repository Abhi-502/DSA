// ==========================================================
// 1. Two Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 59%)
// Memory     : 46.6 MB (Beats 90%)
// Link       : https://leetcode.com/problems/two-sum/
// ==========================================================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(mp.containsKey(diff)){
                return new int[]{i,mp.get(diff)};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}