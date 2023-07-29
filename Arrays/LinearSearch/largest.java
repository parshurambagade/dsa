import java.util.*;

public class largest{
    public static int findLargest(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,5,3,56,2,6};
        int result = findLargest(arr);
        System.out.println(result);

    }
}