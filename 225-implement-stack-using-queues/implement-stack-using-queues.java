class MyStack {

   Queue<Integer> q = new LinkedList<>();

    public MyStack() {
       // q = new LinkedList<>();
    }
    
    public void push(int x) {
        Queue<Integer> q2 = new LinkedList<>();
        while( q.size() > 0)
        q2.add(q.poll());

        q.add(x);

        while( q2.size() > 0 )
        q.add(q2.poll());
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size() == 0 ? true : false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */