public class trappedWaterLevel {
    public static int findTotalTrappedWater(int height[]){

        int trappedWaterHeight = 0;
        int totalTrappedWater = 0;

        //left max boundary 
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        for(int i=0; i<height.length; i++){
            //trappedWaterHeight = min(leftMax bound, rightMax bound);
            trappedWaterHeight = Math.min(leftMax[i], rightMax[i]);

            //totalTrappedWater += (trappedWaterLevel - height) * width;
            totalTrappedWater += trappedWaterHeight - height[i];
        }

        return totalTrappedWater;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int result = findTotalTrappedWater(height);
        System.out.print(result);
    }
}
