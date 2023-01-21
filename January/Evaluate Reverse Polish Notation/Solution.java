class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        int rightNumber = 0;
        int leftNumber = 0;
        Stack<Integer> numbers = new Stack<>();
        for(String current : tokens){
            switch(current){
                case "+":
                    rightNumber = numbers.pop();
                    leftNumber = numbers.pop();
                    numbers.push(leftNumber + rightNumber);
                    break;
                case "-":
                    rightNumber = numbers.pop();
                    leftNumber = numbers.pop();
                    numbers.push(leftNumber - rightNumber);
                    break;
                case "/":
                    rightNumber = numbers.pop();
                    leftNumber = numbers.pop();
                    numbers.push(leftNumber / rightNumber);
                    break;
                case "*":
                    rightNumber = numbers.pop();
                    leftNumber = numbers.pop();
                    numbers.push(leftNumber * rightNumber);
                    break;
                default:
                    numbers.push(Integer.parseInt(current));
                    break;

            }
        }
        return numbers.pop();

    }
}