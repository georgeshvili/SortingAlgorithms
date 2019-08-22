package simpleSort;

public abstract class SimpleSorter implements Sortable {

    protected static <T> void swap (T[] arr, int indexFirst, int indexSecond){
        T tmp = arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = tmp;
    }


    protected abstract <T extends Comparable<T>> T[] sort(T[] arr, Boolean increase);

    public <T extends Comparable<T>> T[] sortIncrease(T[] arr){
        if(arr == null || arr.length <= 1)
            return arr;
        return sort(arr, true);
    }

    public <T extends Comparable<T>> T[] sortDecrease(T[] arr){
        if(arr == null || arr.length <= 1)
            return arr;
        return sort(arr, false);
    }

}
