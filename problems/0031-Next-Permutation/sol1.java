// ==========================================================
// 31. Next Permutation
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44 MB (Beats 86%)
// Link       : https://leetcode.com/problems/next-permutation/
// ==========================================================

class Solution {
    public void nextPermutation(int[] nums) {
        int i,j,n=nums.length;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                for(j=n-1;j>=0;j--){
                    if(nums[j]>nums[i]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
               
                break;
            }
        }
                i=i+1;
                j=n-1;
                while(i<j){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j--;
                }
    }
}