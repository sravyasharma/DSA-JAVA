class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right=0,left=0;
        for(int n:nums) right+=n;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            ans[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return ans;
    }
}