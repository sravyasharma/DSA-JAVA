class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n<m) return "";
        int start=0,minL=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int[] freq=new int[128];
            for(char c:t.toCharArray()){
                freq[c]++;
            }
            int c=m;
            for(int j=i;j<n;j++){
                if(freq[s.charAt(j)]>0) c--;
                freq[s.charAt(j)]--;
                while(c==0){
                    if(j-i+1<minL){
                        minL=j-i+1;
                        start=i;
                    }
                    freq[s.charAt(i)]++;
                    if(freq[s.charAt(i)]>0) c++;
                    i++;
                }
            }
        }
        return minL==Integer.MAX_VALUE?"":s.substring(start,start+minL);
    }
}