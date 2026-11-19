class MinStack {
    List<Integer> minstack;
    List<Integer> mainstack;

    public MinStack() {
        minstack = new ArrayList<>();
        mainstack = new ArrayList<>();
    }

    public void pop() {
        if (mainstack.isEmpty()) return;
        if (minstack.getLast().equals(mainstack.getLast())) minstack.removeLast();
        mainstack.removeLast();
    }

    public void push(int val) {
        mainstack.add(val);
        if (minstack.isEmpty() || val <= minstack.getLast()) minstack.add(val);
    }

    public int top() { return mainstack.getLast(); }

    public int getMin() { return minstack.getLast(); }
}
