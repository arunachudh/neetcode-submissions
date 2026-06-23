class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<int[]> minStack = new Stack<>();

    public MinStack() {

    }
    public void push(int x) {
        stack.push(x);
        if(minStack.empty()||minStack.peek()[0]>x){
            minStack.push(new int[]{x,1});
        }
        else if(minStack.peek()[0]==x){
            minStack.peek()[1]++;
        }

    }

    public void pop() {
        //System.out.println("First" + minStack.peek()[0]);
        //System.out.println("Second" + minStack.peek()[1]);
        if(minStack.peek()[0]==stack.peek()){
            minStack.peek()[1]--;
        }
        if(minStack.peek()[1]==0){
            minStack.pop();
        }
        stack.pop();
    }
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(!minStack.empty()){
            return minStack.peek()[0];
        }
        return -1;
    }

}
