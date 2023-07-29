import java.util.*;

public class buyAndSellStocks {
    public static int findProfitDay(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<arr.length; i++){
            int sellPrice = arr[i];
            if(buyPrice<sellPrice){
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = sellPrice;
            }
        }

        return maxProfit;
    }
    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        int result = findProfitDay(prices);
        System.out.print(result);
    }   
}
