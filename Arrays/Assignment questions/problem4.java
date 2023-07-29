public class problem4 {
    public static int calculateWater(int height[]){
        int width = 1;
        int totalWater = 0;
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], height[i-1]);
        }
        for(int i=0; i<leftMax.length; i++){
            System.out.print(leftMax[i] + " ");

        }

        System.out.println();

        int n = height.length;

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], height[i+1]);
        }
        for(int i=0; i<leftMax.length; i++){
            System.out.print(rightMax[i] + " ");

        }

        System.out.println();
        
        int waterHeight[] = new int[n];
        for(int i=0; i<n; i++){
            waterHeight[i] = (Math.min(leftMax[i], rightMax[i])) - height[i];

            // if(waterHeight[i]<0){
            //     waterHeight[i]=0;
            // }
            totalWater += waterHeight[i];
        }
        for(int i=0; i<leftMax.length; i++){
            System.out.print(waterHeight[i] + " ");

        }
         
        System.out.println();


        return totalWater;
    }


    public static void main(String[] args){
        // int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height[] = {1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(calculateWater(height));
    }
}
