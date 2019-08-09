package effectiveSort;

public class QuickSort extends EffectiveSorter {

    private <T extends Comparable<T>> int chooseMedLomuto(T[] arr, int low, int high, Boolean increase)  {

        T med = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j].compareTo(med) < 0 == increase){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private <T extends Comparable<T>> void recursiveSort(T[] arr, int low, int high, Boolean increase){

        if(low < high) {
            int med = chooseMedLomuto(arr, low, high, increase);
            recursiveSort(arr, low, med - 1, increase);
            recursiveSort(arr, med + 1, high, increase);
        }

    }

    @Override
    protected <T extends Comparable<T>> T[] sort(T[] arr, Boolean increase){
        recursiveSort(arr, 0, arr.length - 1, increase);
        return arr;
    }

}
