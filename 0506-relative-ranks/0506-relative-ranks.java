class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int num:score) pq.offer(num);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        while(!pq.isEmpty()) map.put(pq.poll(),rank++);
        String[] res=new String[score.length];
        for(int i=0;i<=score.length-1;i++){
            int r=map.get(score[i]);
            if(r==1) res[i]="Gold Medal";
            else if(r==2) res[i]="Silver Medal";
            else if(r==3) res[i]="Bronze Medal";
            else res[i]=Integer.toString(r);
        }
        return res;
    }
}