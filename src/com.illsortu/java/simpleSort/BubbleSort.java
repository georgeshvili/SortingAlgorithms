package simpleSort;

public class BubbleSort extends Sorter {

    public static <T extends Comparable<T>> T[] bubbleSort(T[] arr, Boolean increase){

        for(int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[i]) > 0 == increase)
                    swap(arr, i, j);
            }
        }
        return arr;
    }

}
