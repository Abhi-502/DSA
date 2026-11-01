// ==========================================================
// 349. Intersection of Two Arrays
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 51%)
// Memory     : 44.3 MB (Beats 93%)
// Link       : https://leetcode.com/problems/intersection-of-two-arrays/
// ==========================================================

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> l=new HashSet<>();
        for(int num:nums1){
            s.add(num);
        }
        for(int num:nums2){
            if(s.contains(num)){
                l.add(num);
            }
        }
        int ans[]=new int[l.size()];
        int i=0;
        for(int num:l){
            ans[i++]=num;
        }
        return ans;

    }
}