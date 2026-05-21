class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int n:arr1){
            while(n>0){
                set.add(n);
                n/=10;
            }
        } 
        for(int n:arr2){
            while(n>0){
                if(set.contains(n)){
                    int pre=String.valueOf(n).length();
                    max=Math.max(max,pre);
                    break;
                }
                n/=10;
            }
        }
        return max;
    }
}