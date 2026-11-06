// ==========================================================
// 128. Longest Consecutive Sequence
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 31 ms (Beats 64%)
// Memory     : 94.8 MB (Beats 75%)
// Link       : https://leetcode.com/problems/longest-consecutive-sequence/
// ==========================================================

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int maxi=0;
        for(int i=0;i<nums.length;i++){
             s.add(nums[i]);
        }
        for(int ele:s){
            int p=ele;
            if(!s.contains(p-1)){
                int st=1;
                while(s.contains(p+1)){
                    st+=1;
                    p+=1;
                }
                maxi=Math.max(maxi,st);
            }
        }        
        return maxi;
    }
}