class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(char s : S.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == s){
                stack.pop();
            }else{
                stack.push(s);
            }
        }

        StringBuilder str = new StringBuilder();
        for(char c : stack) str.append(c);

        return str.toString();
    }
}