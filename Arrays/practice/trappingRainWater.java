public class trappingRainWater {
    public static void trappedWater(int height[]){
        int totalWater = 0;
        int lmb[] = new int[height.length];
        lmb[0] = height[0];
        for(int i=1; i<lmb.length; i++){
            lmb[i] = Math.max(lmb[i-1], height[i]);
        }

        int rmb[] = new int[height.length];
        rmb[rmb.length-1] = height[height.length-1];
        for(int i=rmb.length-2; i>=0; i--){
            rmb[i] = Math.max(rmb[i+1], height[i]);
        }

        int waterHeight[] = new int[height.length];
        for(int i=0; i<waterHeight.length; i++){
            waterHeight[i] = (Math.min(lmb[i], rmb[i])) - height[i];
            totalWater += waterHeight[i];
        }

        for(int i=0; i<waterHeight.length; i++){
            System.out.print(waterHeight[i]);
        }
    }
    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trappedWater(height);
    }
}
