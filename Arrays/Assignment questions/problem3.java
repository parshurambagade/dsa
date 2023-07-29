import java.util.*;

public class problem3 {
    public static int findMaxProfit(int arr[]){
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = arr[0];
        int profit = 0;
        for(int i=1; i<arr.length; i++){
            int sellPrice = arr[i];
            if(buyPrice<sellPrice){
                profit = sellPrice-buyPrice;
            }else{
                buyPrice = sellPrice;
            }
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[] = {7,5,3,6,8,4};
        // int prices[] = {7,5,4,3,1};
        System.out.print(findMaxProfit(prices));
    }
}
