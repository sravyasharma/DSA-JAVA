class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];

        if(grid[row][col]==color) return grid;

        dfs(grid,row,col,grid[row][col],vis,color,n,m);
        return grid;
    }
    public void dfs(int[][] grid,int i,int j,int val,boolean[][] vis,int color,int n,int m){
        if(i>n-1 || i<0 || j>m-1 || j<0 || grid[i][j]!=val || vis[i][j]) return;
        vis[i][j]=true;
        boolean border=false;
        if(i==0 || j==0 || i==n-1 || j==m-1 || grid[i+1][j]!=val || grid[i-1][j]!=val || grid[i][j+1]!=val || grid[i][j-1]!=val) border=true;

        dfs(grid,i+1,j,val,vis,color,n,m);
        dfs(grid,i-1,j,val,vis,color,n,m);
        dfs(grid,i,j+1,val,vis,color,n,m);
        dfs(grid,i,j-1,val,vis,color,n,m);

        if(border) grid[i][j]=color; 
    }
}