class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        while((t - (q.peek() != null ? q.peek() : 0)) > 3000 && q.size() > 1) {
            q.poll();
        }

        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */