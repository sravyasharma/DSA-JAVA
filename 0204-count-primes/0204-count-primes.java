class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean[] p=new boolean[n];
        for(int i=2;i<n;i++){
            if(!p[i]){
                count++;
                for(int j=i+i;j<n;j+=i){
                    p[j]=true;
                }
            }
        }
        return count;
    }
}