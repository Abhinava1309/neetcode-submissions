class Solution {
    public int maxProfit(int[] prices) {
        int buyingprice=Integer.MAX_VALUE;
        int sellingprice=0;
        int profit=0;
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<buyingprice){
                buyingprice=prices[i];
                 sellingprice=prices[i];
            }
            if(prices[i]>buyingprice && prices[i]>sellingprice){
                sellingprice=prices[i];
            }
            profit=sellingprice-buyingprice;
            maxprofit=Math.max(maxprofit,profit);
            
        }
        return maxprofit;
    }
}
