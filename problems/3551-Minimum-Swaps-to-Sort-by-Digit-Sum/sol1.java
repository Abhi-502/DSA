// ==========================================================
// 3551. Minimum Swaps to Sort by Digit Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1085 ms (Beats 19%)
// Memory     : 114.9 MB (Beats 69%)
// Link       : https://leetcode.com/problems/minimum-swaps-to-sort-by-digit-sum/
// ==========================================================

import java.util.Arrays;

class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        Arrays.sort(arr,(a,b)->{
            int valA=nums[a];
            int valB=nums[b];
            int sumA=digitsum(valA);
            int sumB=digitsum(valB);
            if(sumA!=sumB){
                return Integer.compare(sumA,sumB);
            }else{
                return Integer.compare(valA,valB);
            }
        });
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]||arr[i]==i){
                continue;
            }
            int cyclesize=0;
            int j=i;
            while(!visited[j]){
                visited[j]=true;
                j=arr[j];
                cyclesize++;
            }
            if(cyclesize>0){
                count +=(cyclesize-1);
            }
        }
        return count;
    }
    public int digitsum(int n){
        int sum=0;
        while(n!=0){
            sum +=n%10;
            n/=10;
        }
        return sum;
    }
}
