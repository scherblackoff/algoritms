package homework2;

import homework2.stackImpl.Stack;
import homework2.stackImpl.StackImpl;

public class RevertString {

    private String stringLine;
    private Stack<Character> stack;

    public RevertString(String stringLine) {
        this.stringLine = stringLine;
    }

    public String revert(){
        stack = new StackImpl<>(stringLine.length());
        pushAll();
        stringLine = popAll();
        return stringLine;
    }

    private void pushAll(){
        for (int i = 0; i < stringLine.length(); i++) {
            stack.push(stringLine.charAt(i));
        }
    }

    private String popAll() {
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return String.valueOf(stringBuilder);
    }

    public void show(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return stringLine;
    }
}
