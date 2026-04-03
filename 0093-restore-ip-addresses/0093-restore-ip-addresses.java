class Solution {
    List<String> res=new ArrayList<>();
    String str;
    public List<String> restoreIpAddresses(String s) {
        str=s;
        dfs("",0,0);
        return res;
    }
    void dfs(String path,int index,int dots){
        if(dots>4) return;
        if(dots==4 && index>=str.length()){
            res.add(path.substring(0,path.length()-1));
            return;
        }
        for(int i=1;i<=3 && index+i<=str.length();i++){
            String num=str.substring(index,index+i);
            if(num.charAt(0)=='0' && i!=1) return;
            else if(Integer.parseInt(num)<=255) dfs(path+ str.substring(index, index+i)+".",index+i,dots+1);
        }
    }
}