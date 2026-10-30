// ==========================================================
// 15. 3Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 444 ms (Beats 11%)
// Memory     : 60.1 MB (Beats 12%)
// Link       : https://leetcode.com/problems/3sum/
// ==========================================================

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,Integer> mp= new HashMap<>();
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(i>0 && nums[i]==nums[i-1]) continue;
           int t=-nums[i];
           Set<Integer> s=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int c=t-nums[j];
                if(s.contains(c)){
                    List<Integer> ls=Arrays.asList(nums[i],c,nums[j]);
                    res.add(ls);
                }
                s.add(nums[j]);
            }    


        }
        return new ArrayList<>(res);
    }
}