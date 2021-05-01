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


    public boolean isValid1(String s){
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : chars){
            if(c=='(' || c == '[' || c== '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                if(c==')' || (stack.pop() == '(') ){return true;}
                if(c==']' || (stack.pop() == '[') ){return true;}
                if(c=='}' || (stack.pop() == '{') ){return true;}

            }
            
        }
        return stack.isEmpty();
    }
}


class Solution {
    public boolean isValid(String s) {
        if(s=="" || s==null){return false;}
        char [] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : chars){
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
