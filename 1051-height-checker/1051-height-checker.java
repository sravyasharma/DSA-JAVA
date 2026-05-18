class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] exp=heights.clone();
        Arrays.sort(exp);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=exp[i]) count++;
        }
        return count;
    }
}