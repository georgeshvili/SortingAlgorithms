package effectiveSort;

public abstract class EffectiveSorter implements Sortable {

    protected <T> void swap(T[] arr, int indexFirst, int indexSecond){

        T tmp = arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = tmp;

    }

    protected abstract <T extends Comparable<T>> T[] sort(T[] arr, Boolean increase);

    public <T extends Comparable<T>> T[] sortIncrease(T[] arr) {
        return sort(arr, true);
    }

    public <T extends Comparable<T>> T[] sortDecrease(T[] arr) {
        return sort(arr, false);
    }
}
