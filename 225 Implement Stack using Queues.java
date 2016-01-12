class MyStack {
    // Push element x onto stack.
    Queue<Integer> stack= new LinkedList<>();
    public void push(int x) {
        stack.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Queue<Integer> b= new LinkedList<>();
        while (stack.size() > 1) {
            int t= stack.poll();
            b.add(t);
        }
        stack= b;
    }

    // Get the top element.
    public int top() {
        Queue<Integer> b= new LinkedList<>();
        int t= 0;
        while (stack.size() > 0) {
            t= stack.poll();
            b.add(t);
        }
        stack= b;
        return t;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return (stack.size() == 0);
    }
}
