class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int[] res={-1,-1};
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target) right=mid-1;
            else left=mid+1;
            if(mid<nums.length && nums[mid]==target) res[0]=mid;
        }
        left=0;right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target) left=mid+1;
            else right=mid-1;
            if(mid<nums.length && nums[mid]==target) res[1]=mid;
        }
        return res;
    }
}