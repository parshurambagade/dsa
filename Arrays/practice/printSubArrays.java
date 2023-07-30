import java.util.*;

public class printSubArrays {
    public static void subArrays(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int curSum = 0;
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    curSum += arr[k];
                    System.out.print(arr[k]);
                }
                System.out.print("] ");
                maxSum = Math.max(curSum, maxSum);
                minSum = Math.min(minSum, curSum);
            }
            System.out.println();
        }
        System.out.println("Max Sum: " + maxSum);
        System.out.println("Min Sum: " + minSum);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        subArrays(arr);
    }
}
