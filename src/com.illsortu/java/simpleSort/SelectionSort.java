package simpleSort;

public class SelectionSort extends SimpleSorter {

    private static <T extends Comparable<T>> int findMin(T[] arr, int begin, Boolean increase){

        int min = begin;

        for(int i = begin + 1; i < arr.length; i++){
            if(arr[i].compareTo(arr[min]) < 0 == increase)
                min = i;
        }
        return min;
    }

    protected <T extends Comparable<T>> T[] sort(T[] arr, Boolean increase){

        for(int i = 0; i < arr.length; i++){
            swap(arr, i, findMin(arr, i, increase));
        }
        return arr;
    }
}
