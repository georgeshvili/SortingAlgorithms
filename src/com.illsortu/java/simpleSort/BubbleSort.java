package simpleSort;

public class BubbleSort {

    private static <T> void swap (T[] arr, int indexFirst, int indexSecond){
        T tmp = arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = tmp;
    }

    public static <T extends Comparable<T>> T[] bubbleSort(T[] arr, Boolean increasing){

        for(int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[i]) > 0 == increasing)
                    swap(arr, i, j);
            }
        }
        return arr;
    }

}
