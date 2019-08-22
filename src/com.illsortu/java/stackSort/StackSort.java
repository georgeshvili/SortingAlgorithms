package stackSort;

import java.util.Stack;

public class StackSort extends StackSorter {

    public <T extends Comparable<T>> Stack<T> sort(Stack<T> stack, Boolean increase){

        Stack<T> tmpStack = new Stack<T>();
        while(!stack.empty()){
            T tmp = stack.pop();
            while (!tmpStack.empty() && tmpStack.peek().compareTo(tmp) < 0){
                stack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        if(increase){
            while(!tmpStack.empty())
                stack.push(tmpStack.pop());
            return stack;
        } else
            return tmpStack;
    }

}
