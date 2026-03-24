class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int tot=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k) tot+=Math.min(tickets[i],tickets[k]);
            else tot+=Math.min(tickets[i],tickets[k]-1);
        }
        return tot;
    }
}