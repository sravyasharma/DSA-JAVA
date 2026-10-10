class Solution {
    private List<Integer> list;
    private int tot;
    public Solution(int[] w) {
        int runningSum=0;
        list=new ArrayList<>();
        for(int we:w){
            runningSum+=we;
            list.add(runningSum);
        }
        tot=runningSum;
    }
    
    public int pickIndex() {
        Random r=new Random();
        int target=r.nextInt(tot)+1;
        int left=0, right=list.size();
        while(left<right){
            int mid=left+(right-left)/2;
            if(target>list.get(mid)) left=mid+1;
            else right=mid;
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */