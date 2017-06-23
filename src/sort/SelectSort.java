package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 * 选择排序
 */
public class SelectSort {

    public void sort(int[] arr){
        int k = 0;
        for (int i = 0; i < arr.length; i ++ ){
            k = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[k]){
                    k = j;
                }
            }

            if (k != i){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("选择排序的排序结果为:\t");
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+"\t");
        }
    }
}
