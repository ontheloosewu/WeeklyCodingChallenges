import java.util.*;

public class MyStack{
    private Stack<Integer> myStack = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();

    public int push(int num){
        myStack.add(myStack.size(), num);
        if(maxStack.size() == 0){
            maxStack.add(num);
        } else if (maxStack.lastElement() < num) {
            maxStack.add(maxStack.size(), num);
        }
        return num;
    }

    public int pop(){
        try {
            int obj = myStack.peek();
            myStack.remove(myStack.size()-1);
            if (maxStack.lastElement() == obj){
                maxStack.remove(maxStack.size()-1);
            }
            return obj;
        } catch (Exception e){
            throw new RuntimeException("No elements in stack.");
        }
    }

    public int maxValue(){
        try {
            return maxStack.lastElement();
        } catch (Exception e){
            throw new RuntimeException("No elements in stack.");
        }
    }

    public Stack<Integer> getMyStack(){
        return myStack;
    }

    public Stack<Integer> getMaxStack(){
        return maxStack;
    }
}
