class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int counter = 0;
        int maincounter =0;
        int size = tickets.length;
        while(tickets[k]!=0){
            if(tickets[maincounter]!=0){
                tickets[maincounter]--;
                counter++;
            }
            maincounter++;
            maincounter= maincounter%size;
        }
        return counter;
    }
}