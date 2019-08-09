package effectiveSort;

import java.util.Arrays;

public class MergeSort extends EffectiveSorter {

    private <T extends Comparable<T>> void merge(T[] arr, T[] leftArr, T[] rightArr, Boolean increase){

        int i, j, k;
        i = j = k = 0;
        while(i < leftArr.length && j < rightArr.length) {
            if(leftArr[i].compareTo(rightArr[j]) > 0 == increase){
                arr[k] = rightArr[j];
                j++;
            } else {
                arr[k] = leftArr[i];
                i++;
            }
            k++;
        }
        while(i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < rightArr.length){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private <T extends Comparable<T>> void sortRecursive(T[] arr, Boolean increase){

        if(arr.length <= 1){
            return;
        } else {

            T[] leftArr = Arrays.copyOfRange(arr, 0, arr.length / 2);
            T[] rightArr = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

            sortRecursive(leftArr, increase);
            sortRecursive(rightArr, increase);

            merge(arr, leftArr, rightArr, increase);
        }
    }

    @Override
    protected <T extends Comparable<T>> T[] sort(T[] arr, Boolean increase){
        sortRecursive(arr, increase);
        return arr;
    }

}
