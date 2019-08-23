package simpleSort;

public class BubbleSort extends SimpleSorter {

    @Override
    protected <T extends Comparable<T>> T[] sort(T[] arr, Boolean increase){

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0 == increase)
                    swap(arr, j, j + 1);
            }
        }
        return arr;
    }
}
