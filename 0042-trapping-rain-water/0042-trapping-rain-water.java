class Solution {
    public int trap(int[] height) {
        int tot=0;
        int leftM=0,rightM=0;
        int left=0,right=height.length-1;
        while(left<right){
            leftM=Math.max(leftM,height[left]);
            rightM=Math.max(rightM,height[right]);
            if(leftM<rightM){
                tot+=leftM-height[left];
                left++;
            }
            else{
                tot+=rightM-height[right];
                right--;
            }
        }
        return tot;
    }
}