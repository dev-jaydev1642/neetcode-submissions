class MinStack {
    private List<Integer> minstack;
    private List<Integer> mainstack;

    public MinStack() {
        minstack = new ArrayList<>();
        mainstack = new ArrayList<>();
    }

    void push(int val) {
        if (mainstack.isEmpty() || val <= minstack.getLast()) minstack.add(val);
        mainstack.add(val);
    }

    void pop() {
        if (mainstack.isEmpty()) return;
        if (minstack.getLast().equals(mainstack.getLast())) minstack.removeLast();
        mainstack.removeLast();
    }

    int top() {
        return mainstack.getLast();
    }

    int getMin() {
        return minstack.getLast();
    }
}
