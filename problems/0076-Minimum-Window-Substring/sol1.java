// ==========================================================
// 76. Minimum Window Substring
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 100%)
// Memory     : 45 MB (Beats 93%)
// Link       : https://leetcode.com/problems/minimum-window-substring/
// ==========================================================

class Solution {
    public String minWindow(String s, String t) {
       if(s==null||t==null||s.length()<t.length()){
        return "";
       }
       int []map=new int[128];
       for(char c:t.toCharArray()){
            map[c]++;
       }
       int l=0,r=0,minstart=0,minlen=Integer.MAX_VALUE;
       int count=t.length();
       while(r<s.length()){
        char rc=s.charAt(r);
        if(map[rc]>0){
            count--;
        }
        map[rc]--;
        r++;
        while(count==0){
            if(r-l < minlen){
                minlen=r-l;
                minstart=l;
            }
            char lc=s.charAt(l);
            map[lc]++;
            if(map[lc]>0){
                count++;
            }
            l++;
        }
       }
       return minlen == Integer.MAX_VALUE?"":s.substring(minstart,minstart+minlen);
    }
}