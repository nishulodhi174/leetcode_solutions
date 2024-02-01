class MyQueue {
    
    private Stack<Integer> s;
    public MyQueue() {
        s = new Stack<>();
    }
    
    public void push(int x) {
        pushAtBottom(x,s);
    }
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */