package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 * 插入排序
 */
public class InsertSort {

    public void sort(int[] arr){
        int i = 0, j =0;

        for (; i < arr.length; i ++){
            int temp = arr[i];
            for (j = i; j > 0 && temp < arr[j-1]; j --){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }

        System.out.println("插入排序结果为:\t");
        for (i = 0; i < arr.length; i ++ ){
            System.out.print(arr[i] + "\t");
        }

    }
}
