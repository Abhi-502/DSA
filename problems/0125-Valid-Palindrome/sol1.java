// ==========================================================
// 125. Valid Palindrome
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 37%)
// Memory     : 44.4 MB (Beats 51%)
// Link       : https://leetcode.com/problems/valid-palindrome/
// ==========================================================

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String p=sb.toString();
        String rev=new StringBuilder(p).reverse().toString();
        return p.equals(rev);
    }
    
}