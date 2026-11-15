// ==========================================================
// 387. First Unique Character in a String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 26 ms (Beats 49%)
// Memory     : 46.6 MB (Beats 77%)
// Link       : https://leetcode.com/problems/first-unique-character-in-a-string/
// ==========================================================

class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}