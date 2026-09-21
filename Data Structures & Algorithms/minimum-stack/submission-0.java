class MinStack {
    private List<Integer> minStack;
    private List<Integer> mainStack;
    
    public MinStack() {
        minStack = new ArrayList<>();
        mainStack = new ArrayList<>();
    }
    
    public void push(int val) {
        mainStack.add(val);

        if (minStack.isEmpty() || val <= minStack.getLast()) {
            minStack.add(val);
        }
    }
    
    public void pop() {
        if (mainStack.isEmpty()) return;
        if (mainStack.getLast().equals(minStack.getLast())) minStack.removeLast();
        mainStack.removeLast();
    }
    
    public int top() {
        return mainStack.getLast();
    }
    
    public int getMin() {
        return minStack.getLast();
    }
}
