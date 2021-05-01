class RecentCounter {
    Queue<Integer> queue = null;

    public RecentCounter() {
        queue = new LinkedList();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.size()> 0 && (t - queue.peek()) > 3000){
            queue.pop();
        }
        return queue.size(); 
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */


class RecentCounter1{
    private Queue <Integer> = null;
    RecentCounter(){
        queue = new LinkedList();
    }
    public int ping(int t){
        queue.add(t);
        while((t-queue.peek())>3000 && queue.size()>0 ){
            queue.pop();
        }
    }
    return queue.size();
}