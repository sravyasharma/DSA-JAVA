class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0,min=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target) {
                min=Math.min(min,r-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}