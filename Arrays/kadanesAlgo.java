import java.util.*;

public class kadanesAlgo {
    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i=0; i<arr.length; i++){
           
            currSum = currSum + arr[i];
        
            if(currSum<0){
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("maximum sum: " + maxSum);
    }
    public static void main(String[] args){
        int arr[] = {-1,4,-2,3,4,5,-3};
        kadanes(arr);
    }    
}
