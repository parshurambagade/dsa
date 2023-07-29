import java.util.*;

public class problem2 {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static int rotateAndFindIndexOfResult(int nums[], int num){
        int k = getRandomNumber(1,nums.length);
        int p = k;
        System.out.println(" k " + k);
        int arr[] = new int[nums.length];
        int i = 0;
        int n = 0;
        while(i<nums.length-p){
            arr[i] = nums[k];
            i++;
            k++;
        }
       while(i<nums.length){
        arr[i] = nums[n];
        i++;
        n++;
       }

        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]);
        }

        System.out.println();
        for(int j=0; j<arr.length; j++){
            if(arr[j] == num){
                return j;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {0,1,2,4,5};
        int target = 5;
        int result = rotateAndFindIndexOfResult(nums,target);
        System.out.print(result);
       
    }
}
