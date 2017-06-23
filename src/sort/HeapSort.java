package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 * 堆排序
 */
public class HeapSort {
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i ++){
            createMaxHeap(arr, arr.length-i-1);
            swap(arr, 0 , arr.length-i-1);
        }

        System.out.println("堆排序结果为:\t");
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+"\t");
        }
    }


    public void createMaxHeap(int[] arr, int lastIndex){
        for (int i = (lastIndex-1)/2; i >= 0; i --){
            int k = i;
            while (2*k+1 <= lastIndex){
                int biggerIndex = 2*k+1;
                if (biggerIndex + 1 <= lastIndex && arr[biggerIndex] < arr[biggerIndex+1]){
                    biggerIndex = biggerIndex +1;
                }
                if (arr[k] < arr[biggerIndex]){
                    swap(arr, k, biggerIndex);
                    k = biggerIndex;
                }else {
                    break;
                }
            }
        }


    }


    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
