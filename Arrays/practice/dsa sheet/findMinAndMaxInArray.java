import java.util.*;

public class findMinAndMaxInArray {
    public static void findMinMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        System.out.print("max: " + max + " min: " + min);
    }
    public static void main(String[] args){
        int arr[] = {1,34,6,2,1,-7,5};
        findMinMax(arr);
    }
}
