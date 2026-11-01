// ==========================================================
// 189. Rotate Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 57%)
// Memory     : 268 MB (Beats 90%)
// Link       : https://leetcode.com/problems/rotate-array/
// ==========================================================

class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k%=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        } 
        i=0;j=k-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        i=k;j=n-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        
    }
}