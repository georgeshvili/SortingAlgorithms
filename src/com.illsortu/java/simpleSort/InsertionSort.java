package simpleSort;

public class InsertionSort extends SimpleSorter implements Sortable {

    @Override
    protected <T extends Comparable<T>> T[] sort(T[] arr, Boolean increase){

        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--) {
                if(arr[j-1].compareTo(arr[j]) > 0 == increase)
                    swap(arr, j - 1, j);
            }
        }
        return arr;
    }
}