// ==========================================================
// 217. Contains Duplicate
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 20 ms (Beats 38%)
// Memory     : 111.6 MB (Beats 6%)
// Link       : https://leetcode.com/problems/contains-duplicate/
// ==========================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
               return true; 
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}