class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if(stack.empty()||stack.peek()!=map.get(c)) {return false;}
                stack.pop();
            }else
                stack.push(c);
        }
        return stack.empty();
    }
}
