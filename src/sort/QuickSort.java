package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 * 快速排序
 */
public class QuickSort {

    public void sort(int[] arr){
        qSort(arr, 0 , arr.length-1);

        System.out.println("快速排序的结果为:\t");
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+"\t");
        }
    }

    public void qSort(int[] arr, int low, int high){
        if (low < high){
            int middle = getMiddle(arr, low, high);
            qSort(arr, low, middle-1);
            qSort(arr, middle+1, high);
        }
    }

    public int getMiddle(int[] arr, int low, int high){
        int i = low, j = high;
        int temp = arr[i];

        while (i < j){
            while (arr[j] >= temp && j > i){
                j --;
            }
            arr[i] = arr[j];

            while (arr[i] < temp && j > i){
                i ++;
            }
            arr[j] = arr[i];
        }
        arr[i] = temp;
        return i;
    }
}
