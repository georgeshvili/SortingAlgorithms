package runPackage;

import simpleSort.*;
import effectiveSort.*;

public class SorterMain {

    public static void main(String[] args) {
        SorterMain app = new SorterMain();
        app.runEffectiveSort();
    }

    private void runEffectiveSort(){
        EffectiveSorter sorterFirst = new QuickSort();
        Integer[] arrFirst = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        sorterFirst.sortIncrease(arrFirst);
        Util.printArray(arrFirst);
        System.out.println();

        EffectiveSorter sorterSecond = new MergeSort();
        Integer[] arrSecond = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        sorterSecond.sortDecrease(arrSecond);
        Util.printArray(arrSecond);
    }

    private void runSimpleSort() {
        SimpleSorter sorterFirst = new InsertionSort();
        Integer[] arrFirst = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        sorterFirst.sortIncrease(arrFirst);
        Util.printArray(arrFirst);
        System.out.println();

        SimpleSorter sorterSecond = new BubbleSort();
        String[] arrSecond = new String[] {"b", "a", "e", "c", "x", "y", "z"};
        sorterSecond.sortDecrease(arrSecond);
        Util.printArray(arrSecond);
        System.out.println();

        SimpleSorter sorterThird = new SelectionSort();
        Double[] arrThird = new Double[] {10.0, 10.1, 9.9, 9.8, 9.0, 11.0, 8.7, 500.0};
        sorterThird.sortIncrease(arrThird);
        Util.printArray(arrThird);

    }
}

