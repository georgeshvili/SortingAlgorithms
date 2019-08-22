package stackSort;

import java.util.Stack;

public abstract class StackSorter implements Sortable {

    protected abstract  <T extends Comparable<T>> Stack<T> sort(Stack<T> stack, Boolean increase);

    @Override
    public <T extends Comparable<T>> Stack<T> sortIncrease(Stack<T> stack) {
        return sort(stack, true);
    }

    @Override
    public <T extends Comparable<T>> Stack<T> sortDecrease(Stack<T> stack) {
        return sort(stack, false);
    }
}
