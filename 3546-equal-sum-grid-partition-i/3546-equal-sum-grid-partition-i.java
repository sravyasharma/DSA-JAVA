class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        long[] row=new long[m];
        long[] col=new long[n];
        long tot=0;
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                row[i]+=grid[i][j];
                col[j]+=grid[i][j];
                tot+=grid[i][j];
            }
        }
        if(tot%2!=0) return false;
        long tar=tot/2;
        long sum=0;
        for(int i=0;i<=grid.length-1;i++){
            sum += row[i];
            if(sum==tar) return true;
        }
        sum=0;
        for(int j=0;j<=grid[0].length-1;j++){
            sum += col[j];
            if(sum==tar) return true;
        }
        return false;
    }
}