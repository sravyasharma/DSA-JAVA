class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int tar=image[sr][sc];
        if(tar==color) return image;

        dfs(image,sr,sc,tar,color);
        return image;
    }
    public static void dfs(int[][] image,int sr,int sc,int tar,int color){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length) return;
        if(image[sr][sc]!=tar) return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,tar,color);
        dfs(image,sr-1,sc,tar,color);
        dfs(image,sr,sc+1,tar,color);
        dfs(image,sr,sc-1,tar,color);
    }
}