class Solution {
    public int maxProfit(int[] prices) {
        int Bp=Integer.MAX_VALUE;
        int Maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(Bp<prices[i]){
                int profit=prices[i]-Bp;
                Maxprofit=Math.max(Maxprofit,profit);

            }else{
                Bp=prices[i];
            }
        }
        return Maxprofit;
    }
}