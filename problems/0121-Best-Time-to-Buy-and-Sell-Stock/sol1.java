// ==========================================================
// 121. Best Time to Buy and Sell Stock
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 49%)
// Memory     : 93.5 MB (Beats 96%)
// Link       : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// ==========================================================

class Solution {
    public int maxProfit(int[] prices) {
        int j=0;
        //int maxind=-1;
        int maxi=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[j]){
               int p=prices[i]-prices[j];
                maxi=Math.max(p,maxi);
            }else{
                j=i;
            }
        }
        return maxi;
    }
}