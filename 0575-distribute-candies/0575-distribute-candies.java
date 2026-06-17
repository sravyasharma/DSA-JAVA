class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:candyType) map.put(n,map.getOrDefault(0,n)+1);
        return Math.min(map.size(),candyType.length/2);
    }
}