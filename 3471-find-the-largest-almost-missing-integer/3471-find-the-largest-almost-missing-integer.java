class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(k==1){
            int max=-1;
            for(int num:nums){
                if(map.get(num)==1 && num>max) max=num;
            }
            return max;
        }
        if(k==n){
            int max=Integer.MIN_VALUE;
            for(int num:nums){
                max=Math.max(max,num);
            }
            return max;
        }
        if(nums[0]==nums[n-1]) return -1;
        if(map.get(nums[0])==1 && map.get(nums[n-1])==1) return Math.max(nums[0],nums[n-1]);
        if(map.get(nums[0])==1 && map.get(nums[n-1])>1) return nums[0];
        if(map.get(nums[0])>1 && map.get(nums[n-1])==1) return nums[n-1];
        return -1;
    }
}