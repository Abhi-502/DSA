// ==========================================================
// 3. Longest Substring Without Repeating Characters
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 68 ms (Beats 30%)
// Memory     : 47.4 MB (Beats 87%)
// Link       : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// ==========================================================

class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxlen=0;
       int l=0,r=0;
       Set<Character> set=new HashSet<>(); 
       while(r<s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            set.add(s.charAt(r));
            r++;
       }
       return maxlen;
    }
}