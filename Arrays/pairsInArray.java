public class pairsInArray {
    public static void printPairs(int arr[]){
        int tp = 0;
        for(int i=0; i<arr.length; i++){
            int currNum = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + currNum + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total " + tp + " pairs.");
    }
    public static void main(String[] args){
        int arr[] = {1,3,5,7,9};
        printPairs(arr);
    }
}
