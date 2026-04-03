class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        for(String str:banned) set.add(str);
        String[] words=paragraph.split("\\s+");
        String res="";
        int max=0;
        for(String s:words){
            if(!set.contains(s)){
                int c=map.getOrDefault(s,0)+1;
                map.put(s,c);

                if(c>max){
                    max=c;
                    res=s;
                }
            }
        }
        return res; 
    }
}