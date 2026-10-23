class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;int fleet=0;
        int ar[][]=new int[n][2];
        for(int i=0;i<n;i++){
            ar[i][0]=position[i];
            ar[i][1]=speed[i];
        }
        double maxtime=0.0;
        Arrays.sort(ar,(a,b)->(b[0]-a[0]));
        for(int i=0;i<n;i++){
            double time = (double) (target - ar[i][0])/ ar[i][1];
            if(time >maxtime){
                fleet++;
                maxtime=time;
            }
        }
        return fleet;
    }
}
