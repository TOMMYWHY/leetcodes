class Demo{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public boolean isValid(String s) {
        char [] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        foreach(char c : chars){
            if(c == '(' || c == '[' || c== '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){return false;}
                if(c == ')' && stack.pop() != '(' ){return false;}
                if(c == ']' && stack.pop() != '[' ){return false;}
                if(c == '}' && stack.pop() != '{' ){return false;}

            }
        }

        return stack.isEmpty();
    }
}
