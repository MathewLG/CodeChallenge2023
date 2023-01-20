class MinStack {

    ArrayList<Integer> values;

    public MinStack() {
        values = new ArrayList<>();
    }

    public void push(int val) {
        values.add(val);
    }

    public void pop() {
        values.remove(values.size()-1);
    }

    public int top() {
        return values.get(values.size()-1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < values.size(); i++){
            if(values.get(i) < min){
                min = values.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */