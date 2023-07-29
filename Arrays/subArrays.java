import java.util.*;
public class subArrays {
    public static void printSubArrays(int arr[]){
        int sumOfArrays = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                    sumOfArrays += arr[k];
                }
                ts++;
                if(sumOfArrays <= minSum){
                    minSum = sumOfArrays;
                }
                if(sumOfArrays >= maxSum){
                    maxSum = sumOfArrays;
                }
                System.out.println("(Sum: " + sumOfArrays + ")");
                sumOfArrays=0;
            }
            System.out.println();
        }
        System.out.println("Total sub arrays: " + ts);
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Minimum sum: " + minSum);
    }
    public static void main(String[] args){
        int arr[] = {1,3,5,7,9};
        printSubArrays(arr);
    }
}


