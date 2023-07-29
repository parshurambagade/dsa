import java.util.*;

public class introductionOfArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //creating array

        //first method
        // int marks[] = new int[3];

        //second method
        int marks[] = {90,80,100};

        //input values
        System.out.print("Physics: ");
        marks[0] = sc.nextInt();
        System.out.print("Chemistry: ");
        marks[1] = sc.nextInt();
        System.out.print("Biology: ");
        marks[2] = sc.nextInt();
        
        //output values in array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //update values
        // marks[1] = 78;
        // System.out.println(marks[1]);

        //length function
        System.out.println("Length of the array is: " + marks.length);
    }
}