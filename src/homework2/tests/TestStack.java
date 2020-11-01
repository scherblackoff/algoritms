package homework2.tests;


import homework2.RevertString;
import homework2.stackImpl.Stack;

public class TestStack {

    private static final String TEXT = "Hello, world";

    public static void main(String[] args) {
        /*Stack<Integer> stack = new StackImpl<>(10);
        for (int i = 0; i < 10; i++) {
            add(stack, i);
        }
        System.out.println(stack.toString());
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.peek());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.toString());
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());*/
        RevertString revertString = new RevertString(TEXT);
        System.out.println(revertString.revert());
        System.out.println(revertString.revert());
        System.out.println(revertString.revert());
        revertString.show();
    }

    private static boolean add(Stack<Integer> stack, int value){
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }else{
            return false;
        }
    }
}
