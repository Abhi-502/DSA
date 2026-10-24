// ==========================================================
// 4090. Count Magical Substring Pairs I
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 57 ms (Beats 86%)
// Memory     : 46.5 MB (Beats 44%)
// Link       : https://leetcode.com/problems/count-magical-substring-pairs-i/
// ==========================================================

class Solution {
    public int countMagicalPairs(String s) {
      int n = s.length(), ans = 0;
    for (int j = 0; j < n - 1; j++) {
    int[] L = new int[27];
    int[] R = new int[27];
    boolean[] maskL = new boolean[26];
    int uniqueL = 0;
    for (int i = j; i >= 0; i--) {
    int c = s.charAt(i) - 'a';
    if (!maskL[c]) {
    maskL[c] = true;
    uniqueL++;
    }
    L[uniqueL]++;
    }
    boolean[] maskR = new boolean[26];
    int uniqueR = 0;
    for (int k = j + 1; k < n; k++) {
    int c = s.charAt(k) - 'a';
    if (!maskR[c]) {
    maskR[c] = true;
    uniqueR++;
    }
    R[uniqueR]++;
    }
    for (int d = 1; d <= 26; d++) {
    ans += L[d] * R[d];
    }
    }
    return ans;  
    }
}

    