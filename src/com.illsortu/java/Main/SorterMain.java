package Main;

import simpleSort.*;

public class SorterMain {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {5, 3, 10, 4, 8, 11, 2};
        //BubbleSort.bubbleSort(arr, false);
        //System.out.println(SelectionSort.findMin(arr, 1));
        SelectionSort.selectionSort(arr, true);
        Util.printArray(arr);
    }

}

