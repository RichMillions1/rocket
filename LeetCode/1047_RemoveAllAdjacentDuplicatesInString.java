package rocket.LeetCode;

class Solution {
    public String removeDuplicates(String s) {
        int size = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < size; i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder newS = new StringBuilder();
        for(Character ch : stack){
            newS.append(ch);
        }
        return newS.toString();

    }
}