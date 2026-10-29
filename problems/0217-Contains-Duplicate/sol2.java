// ==========================================================
// 217. Contains Duplicate
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 19 ms (Beats 48%)
// Memory     : 107.7 MB (Beats 67%)
// Link       : https://leetcode.com/problems/contains-duplicate/
// ==========================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int num:nums){
            if(st.contains(num)){
                return true;
            }
            st.add(num);
        }
 return false;
    }
}