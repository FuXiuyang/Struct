package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 * 合并排序
 */
public class MergeSort {

    public void sort(int[] arr){
        mSort(arr,0, arr.length-1);

        System.out.println("合并排序的结果为:\t");
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+"\t");
        }
    }

    public void mSort(int[] arr, int low, int high){
        if (low < high){
            int middle = (high+low)/2;
            mSort(arr, low, middle);
            mSort(arr, middle+1, high);
            merge(arr, low, middle, high);
        }
    }

    public void merge(int[] arr, int low, int middle, int high){
        int[] tempArr = new int[high-low+1];
        int i = low, j = middle+1;
        int k = 0;

        while (i <= middle && j <= high){
            if (arr[i] < arr[j]){
                tempArr[k++] = arr[i++];
            }else {
                tempArr[k++] = arr[j++];
            }
        }
        while (i <= middle) tempArr[k++] = arr[i++];
        while (j <= high) tempArr[k++] = arr[j++];

        for (k = 0; k < tempArr.length; k ++){
            arr[low+k] = tempArr[k];
        }
    }
}
