package Main;

import simpleSort.BubbleSort;

public class SorterMain {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        BubbleSort.bubbleSort(arr, false);
        Util.printArray(arr);
    }

}

