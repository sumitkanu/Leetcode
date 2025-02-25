class RecentCounter {
    Queue<Integer> q;
    int counter;
    int time;

    public RecentCounter() {
        counter = 0;
        q = new LinkedList<>();
        time = 0;
    }
    
    public int ping(int t) {
        time = (t - (q.peek() != null ? q.peek() : 0));
        q.offer(t);
        while(time > 3000 && q.size() > 1) {
            q.poll();
            time = (t - (q.peek() != null ? q.peek() : 0)); 
        }

        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */