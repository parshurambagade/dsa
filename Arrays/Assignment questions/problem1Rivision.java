import java.util.*;

public class problem1Rivision{

    public static boolean findDupli(int nums[]){
        int dupliArr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            dupliArr[i] = nums[i];
        }

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<dupliArr.length; j++){
                if(i==j){
                    continue;
                }
                if(dupliArr[j] == nums[i]){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        System.out.print(findDupli(nums));
    }
}