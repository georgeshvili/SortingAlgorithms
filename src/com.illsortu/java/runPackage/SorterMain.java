package runPackage;

import simpleSort.*;
import effectiveSort.*;
import stackSort.*;

import java.util.Stack;

public class SorterMain {

    public static void main(String[] args) {
        SorterMain app = new SorterMain();
        app.runSimpleSort();
        //app.runEffectiveSort();
        //app.runStackSort();
    }

    private void runStackSort(){
        StackSorter sorter = new StackSort();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(82); stack.push(42);
        stack.push(31); stack.push(96);
        stack.push(45); stack.push(26);
        stack.push(32); stack.push(23);
        System.out.println(sorter.sortIncrease(stack));
    }

    private void runEffectiveSort(){
        EffectiveSorter sorterFirst = new QuickSort();
        //Integer[] arrFirst = new Integer[] {};
        Integer[] arrFirst = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        //Integer[] arrFirst = new Integer[] {99, 43, 77, 8, 10, 31, 24, 88, 55, 34, 42};
        sorterFirst.sortDecrease(arrFirst);
        Util.printArray(arrFirst);
        System.out.println();

        /*EffectiveSorter sorterSecond = new MergeSort();
        Integer[] arrSecond = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        sorterSecond.sortDecrease(arrSecond);
        Util.printArray(arrSecond);*/
    }

    private void runSimpleSort() {
        SimpleSorter sorterFirst = new InsertionSort();
        Integer[] arrFirst = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        sorterFirst.sortIncrease(arrFirst);
        Util.printArray(arrFirst);
        System.out.println();

        SimpleSorter sorterSecond = new BubbleSort();
        String[] arrSecond = new String[] {"b", "a", "e", "c", "x", "y", "z", "d", "i", "u"};
        sorterSecond.sortDecrease(arrSecond);
        Util.printArray(arrSecond);
        System.out.println();

        SimpleSorter sorterThird = new SelectionSort();
        Double[] arrThird = new Double[] {10.0, 10.1, 9.9, 9.8, 9.0, 11.0, 8.7, 500.0};
        sorterThird.sortIncrease(arrThird);
        Util.printArray(arrThird);

    }
}

