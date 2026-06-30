class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,ans=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.size()==3){
                ans+=(n-j);
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        return ans;
    }
}