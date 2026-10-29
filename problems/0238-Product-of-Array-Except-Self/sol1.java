// ==========================================================
// 238. Product of Array Except Self
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 92%)
// Memory     : 71.4 MB (Beats 67%)
// Link       : https://leetcode.com/problems/product-of-array-except-self/
// ==========================================================

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        int l=1;
        for(int i=0;i<nums.length;i++){
            res[i]=l;
            l *= nums[i];
        }
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] *= r;
            r *= nums[i];
        }
    return res;    
    }
    
}