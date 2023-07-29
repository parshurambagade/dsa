package BinarySearch;

public class findElement {
    public static int binarySearch(int arr[], int key){
        int start = arr[0];
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //comparision
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                end = mid-1;
            }
            if(key>arr[mid]){
                start = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7,8};
        int key = 5;
        System.out.println("Element is at index " + binarySearch(nums, key));
    }
}
