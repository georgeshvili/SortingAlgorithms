package stackSort;

import java.util.Stack;

public interface Sortable {

    <T extends Comparable<T>> Stack<T> sortIncrease(Stack<T> stack);
    <T extends Comparable<T>> Stack<T> sortDecrease(Stack<T> stack);

}
