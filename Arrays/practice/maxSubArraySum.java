import java.util.*;

public class maxSubArraySum{
    public static int findMaxSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int preSum[] = new int[arr.length];
        preSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                curSum = start == 0 ? preSum[end] : preSum[end] - preSum[start-1];
                maxSum = Math.max(curSum, maxSum);
            }
        }

        return maxSum;
    }

    public static int kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0; i<arr.length; i++){
            curSum += arr[i];
            System.out.print(curSum + " ");
            if(curSum<0){
                curSum = 0;
            }
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // System.out.print("max sum: " + findMaxSum(arr));
        System.out.print("max sum: " + kadanes(arr));
    }
}