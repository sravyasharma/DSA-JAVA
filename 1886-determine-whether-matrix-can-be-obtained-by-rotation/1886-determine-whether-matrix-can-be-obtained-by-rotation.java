class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(Arrays.deepEquals(mat,target)) return true;
            rotate(mat);
        }
        return false;
    }
    public static void rotate(int[][] mat){
        int m=mat.length;
        int[][] temp=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=mat[j][m-i-1];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=temp[i][j];
            }
        }
    }
}