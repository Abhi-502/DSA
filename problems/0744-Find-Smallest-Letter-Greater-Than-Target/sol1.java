// ==========================================================
// 744. Find Smallest Letter Greater Than Target
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.9 MB (Beats 92%)
// Link       : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// ==========================================================

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       char sol=letters[0];
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int low=0;
        int high=letters.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if( letters[mid]>target ){
                sol=letters[mid];
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return sol;
    }
   
}