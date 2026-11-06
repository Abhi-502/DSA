// ==========================================================
// 217. Contains Duplicate
// Difficulty : Easy
// Language   : Java
// Solution   : #3
// Runtime    : 20 ms (Beats 39%)
// Memory     : 107.2 MB (Beats 73%)
// Link       : https://leetcode.com/problems/contains-duplicate/
// ==========================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> mp=new HashSet<>();
        for(int num:nums){
            if(mp.contains(num)){
                return true;
            }
            mp.add(num);
        }
        return false;
    }
}