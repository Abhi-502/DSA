// ==========================================================
// 2089. Find Target Indices After Sorting Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 72%)
// Memory     : 46.2 MB (Beats 44%)
// Link       : https://leetcode.com/problems/find-target-indices-after-sorting-array/
// ==========================================================

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            ls.add(i);
        }
        return ls;
    }
}