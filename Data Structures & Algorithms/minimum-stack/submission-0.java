

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> dummy = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        st.push(val);
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;

        while (!st.isEmpty()) {
            int n = st.pop();
            min = Math.min(min, n);
            dummy.push(n);
        }

        while (!dummy.isEmpty()) {
            st.push(dummy.pop());
        }

        return min;
    }
}
