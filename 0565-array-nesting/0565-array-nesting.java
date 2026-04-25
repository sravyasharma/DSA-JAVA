class Solution {
    public int arrayNesting(int[] nums) {
        boolean[] v=new boolean[nums.length];
        int ans=0;
        for(int i=0;i<=nums.length-1;i++){
            while(!v[i]){
                int c=0,j=i;
                while(!v[j]){
                    c++;
                    v[j]=true;
                    j=nums[j];
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}