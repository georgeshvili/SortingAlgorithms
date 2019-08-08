package simpleSort;

public abstract class Sorter {

    protected static <T> void swap (T[] arr, int indexFirst, int indexSecond){
        T tmp = arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = tmp;
    }

}
