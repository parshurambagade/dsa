
import java.util.*;

public class problem1 {
    public static boolean checkDuplicate(int nums[]){
        //create duplicate array
        int dupliNums[] = new int[nums.length];
        //assign values to the duplicate array
        for(int i=0;i<dupliNums.length; i++ ){
            dupliNums[i] = nums[i];
        } 

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<dupliNums.length; j++){
                if(i==j){
                    continue;
                }
                if(nums[i] == dupliNums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,6,1};
        System.out.print(checkDuplicate(nums));
    }
}
