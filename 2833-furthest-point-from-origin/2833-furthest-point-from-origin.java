class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0,right=0,count=0;
        char[] move=moves.toCharArray();
        for(int i=0;i<=move.length-1;i++){
            if(move[i]=='L') left++;
            else if(move[i]=='R') right++;
            else count++;
        }
        return Math.abs(left-right)+count;
    }
}