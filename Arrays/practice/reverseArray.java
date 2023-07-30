package practice;

public class reverseArray {
    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;

       while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        reverse(arr);
    }
}
