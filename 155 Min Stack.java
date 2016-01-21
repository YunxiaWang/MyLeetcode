class MinStack {
    /*用arraylist超级慢，比直接用stack还慢
    List<Integer> minStack= new ArrayList<>();
    public void push(int x) {
        minStack.add(x);
    }
    public void pop() {
        minStack.remove(minStack.size()-1);
    }
    public int top() {
        return minStack.get(minStack.size()-1);
    }
    public int getMin() {
        int min= minStack.get(0);
        for (int i: minStack) {
            if (i < min) min= i;
        }
        return min;
    }
}*/

    /*自定义类，666*/     
class MinStack {
    private Node head;
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }
    public void pop() {
        head = head.next;
    }
    public int top() {
        return head.val;
    }
    public int getMin() {
        return head.min;
    }
    private class Node {
        int val;
        int min;
        Node next;
        private Node(int val, int min) {
            this(val, min, null);
        }
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    } 
}
