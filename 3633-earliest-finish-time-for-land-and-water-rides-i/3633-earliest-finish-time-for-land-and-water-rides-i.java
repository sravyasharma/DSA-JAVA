class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                res=Math.min(res,Math.max(landStartTime[i]+landDuration[i],waterStartTime[j])+waterDuration[j]);
                res=Math.min(res,Math.max(waterStartTime[j]+waterDuration[j],landStartTime[i])+landDuration[i]);
            }
        }
        return res;
    }
}