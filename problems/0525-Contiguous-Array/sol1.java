// ==========================================================
// 525. Contiguous Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 24 ms (Beats 59%)
// Memory     : 64.7 MB (Beats 95%)
// Link       : https://leetcode.com/problems/contiguous-array/
// ==========================================================

class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int maxlen=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(mp.containsKey(sum)){
                maxlen=Math.max(maxlen,i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }

        }
        return maxlen;
    }
}