class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        int hasX=1001,ans=0;
        int[] arr=new int[n];
        for(int i=0;i<m;i++){
            int temp=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]=='X'){
                    arr[j]+=1;
                    hasX=Math.min(hasX,j);
                }
                else if(grid[i][j]=='Y'){
                    arr[j]-=1;
                }
                temp+=arr[j];

                if(temp==0 && hasX<=j) ans++;
            }
        }
        return ans;
    }
}