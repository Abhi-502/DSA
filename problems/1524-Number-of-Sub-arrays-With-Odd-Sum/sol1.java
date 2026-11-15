// ==========================================================
// 1524. Number of Sub-arrays With Odd Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 80%)
// Memory     : 81.1 MB (Beats 94%)
// Link       : https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
// ==========================================================

class Solution {
    public int numOfSubarrays(int[] s) {
       int mod=1000000007;
        int sum=0;
        int n=s.length;
        int even=1,odd=0;
        int count=0;
       for(int i=0;i<n; i++){
          sum+=s[i];
          if(sum%2==0){
            count=(count+odd)%mod;
            even++;
          }else{
            count=(count+even)%mod;
            odd++;
          }
        }
        return count;
    }
}