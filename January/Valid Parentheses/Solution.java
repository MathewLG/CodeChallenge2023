class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for(Character current : s.toCharArray()){
            if(isOpen(current)){
                charStack.push(current);
            }else{
                if(charStack.size() == 0){
                    return false;
                }
                if(charStack.peek().equals(openChar(current))){
                    charStack.pop();
                }else{
                    return false;
                }
            }
        }
        return charStack.size() == 0;
    }

    public boolean isOpen(Character c){
        if(c == '(' || c == '{' || c == '['){
            return true;
        }else{
            return false;
        }
    }
    public Character openChar(Character c){
        Character result = ' ';
        switch(c){
            case('}'):
                result =  '{';
                break;
            case(')'):
                result = '(';
                break;
            case(']'):
                result = '[';
                break;
        }
        return result;
    }
}
