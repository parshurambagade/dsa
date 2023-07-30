package BinarySearch;

public class problem1 {
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target1 = 7;
        int target2 = 4;

        int result1 = binarySearch(arr, target1);
        int result2 = binarySearch(arr, target2);

        System.out.println("Target 7 found at index: " + result1);
        System.out.println("Target 4 found at index: " + result2);
    }
}
