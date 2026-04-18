class Solution {
    public int mirrorDistance(int n) {
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        sb.reverse();
        int num=Integer.parseInt(sb.toString());
        int diff=Math.abs(n-num);
        return diff;
    }
}