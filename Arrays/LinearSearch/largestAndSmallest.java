package LinearSearch;
import java.util.*;

public class largestAndSmallest {
    //function to find largest and smallest value in array
    public static void findLargestAndSmallest(int arr[]){
        int largest = Integer.MIN_VALUE;//stores minimum int value in the variable "largest"
        int smallest = Integer.MAX_VALUE;//stores maximum int value in the variable "smallest"

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }

            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);

    }

    public static void main(String[] args){
        int nums[] = {3,5,2,7,9,20,4,-5,0};

        findLargestAndSmallest(nums);
    }

}
