package LinearSearch;

public class LinearSearch {
    //function to perform linear search operation
    public static int linearSearch(int nums[], int key){
        //loop for comparing key and elements in array
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }

        return -1;
    }

    
   public static void main(String[] args){
    int numbers[] = {1,3,2,5,4,76,8,53,40};
    int key = 18;
    int index = linearSearch(numbers, key);
    if(index==-1){
        System.out.println("Not found!");
    }else{
        System.out.println("The element found at index " + index);
    }
   } 
}
