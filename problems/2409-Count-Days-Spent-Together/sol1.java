// ==========================================================
// 2409. Count Days Spent Together
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.3 MB (Beats 95%)
// Link       : https://leetcode.com/problems/count-days-spent-together/
// ==========================================================

class Solution {
int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public int countDaysTogether(String aArr, String aLea, String bArr, String bLea) {
            int aStart=toDay(aArr),aEnd = toDay(aLea);
            int bStart=toDay(bArr),bEnd = toDay(bLea);
            int start=Math.max(aStart,bStart);
            int end=Math.min(aEnd,bEnd);
            return Math.max(0, end - start + 1);
}

private int toDay(String s) {
            int m=Integer.parseInt(s.substring(0, 2));
            int d=Integer.parseInt(s.substring(3, 5));
            int sum=0;
            for (int i=0;i<m-1;i++) sum+=days[i];
            return sum+d;
}
}
