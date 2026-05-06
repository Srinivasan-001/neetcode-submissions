class Solution {
    public int maxProfit(int[] prices) {
        int prof=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
            if(prices[j]>prices[i]){
             int pr=prices[j]-prices[i];
              prof=Math.max(prof,pr);
            }
        }
        }
        return prof;
    }
}
