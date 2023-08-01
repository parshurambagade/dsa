public class buyAndSellStocks {
    public static int findMaxProfit(int prices[]){
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length-1; i++){
            int sellPrice = prices[i+1];
            if(buyPrice>sellPrice){
                buyPrice = sellPrice;
            }
            int profit = sellPrice - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
    
        }
        if(maxProfit>0){
            return maxProfit;
        }
        else{
             return 0;
        } 
    }
    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        System.out.print(findMaxProfit(prices));
    }
}
