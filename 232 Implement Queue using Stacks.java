class MyQueue {
    // Push element x to the back of queue.
    private Stack<Integer> a = new Stack<Integer>();
    public void push(int x) {
        a.push(x); // just simply push in and store in a
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> b = new Stack<Integer>(); // reverse order
        Stack<Integer> c = new Stack<Integer>(); // in order
        while (!a.empty()){
            b.push(a.pop());
        }
        b.pop();
        while (!b.empty()){
            c.push(b.pop());
        }
        a = c;
    }

    // Get the front element.
    public int peek() {
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> c = new Stack<Integer>();
        while (!a.empty()){
            b.push(a.pop());
        }
        int p = b.peek();
        while (!b.empty()){
            c.push(b.pop());
        }
        a = c;
        return p;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return a.empty();
    }
}
