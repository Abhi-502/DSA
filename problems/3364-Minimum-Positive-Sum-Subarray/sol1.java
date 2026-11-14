// ==========================================================
// 3364. Minimum Positive Sum Subarray 
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 26%)
// Memory     : 45.8 MB (Beats 80%)
// Link       : https://leetcode.com/problems/minimum-positive-sum-subarray/
// ==========================================================

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
      for(int i=0;i<nums.size();i++){
        int sum=0;
        for(int j=i;j<nums.size()&& j-i+1<=r ;j++){
            sum+=nums.get(j);
            int len=j-i+1;
            if(len>=l && sum>0){
                min=Math.min(sum,min);
            }
        }
      }
      return min==Integer.MAX_VALUE?-1:min;                                                         
    }
}