package effectiveSort;

public interface Sortable {

    <T extends Comparable<T>> T[] sortIncrease(T[] arr);
    <T extends Comparable<T>> T[] sortDecrease(T[] arr);

}
