class Solution {
    public int evalRPN(String[] tokens) {
        int subResult = 0;
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int n2 = Integer.valueOf(stack.pop());
                int n1 = Integer.valueOf(stack.pop());
                switch (s){
                    case "+":
                        subResult = n1 + n2;
                        break;
                    
                    case "-":
                        subResult = n1 - n2;
                        break;
                    case "*":
                        subResult = n1 * n2;
                        break;
                    case "/":
                        if(n2 == 0){
                            throw new ArithmeticException("Division by zero");
                        }
                        subResult = n1 / n2;
                        break;
                }
                stack.push(subResult);
            }else{
                stack.push(Integer.valueOf(s));
            }

        }
        return stack.peek();
    }
}