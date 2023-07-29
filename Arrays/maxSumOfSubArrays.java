public class maxSumOfSubArrays {
    public static void printMaxSumOfSubArrays(int arr[]){
        int prefix[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<prefix.length; i++){
            System.out.println(prefix[i]);

        }
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum: " + maxSum);
    }
    public static void main(String[] args){
        int arr[] = {-1,4,-2,3,4,5,-3};
        printMaxSumOfSubArrays(arr);
    }
}
