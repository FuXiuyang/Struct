package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 */
public class SortMain {

    public static void main(String args[]){
        int arr[] = {0,2,1,6,4,4,5,8,9,7};

        /*SelectSort selectSort = new SelectSort();
        selectSort.sort(arr);*/

        /*InsertSort insertSort = new InsertSort();
        insertSort.sort(arr);*/

        /*BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);*/

        /*ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);*/

        /*QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);*/

        /*MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);*/

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
    }
}
