package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 * 希尔排序
 */
public class ShellSort {

    public void sort(int[] arr){
        int i = 0, j, k = arr.length/2;

        for (; k > 0; k = k/2){

            for (i = 0; i < arr.length; i ++){
                int temp = arr[i];
                for (j = i; j >= k && temp < arr[j-k]; j = j-k){
                    arr[j] = arr[j-k];
                }
                arr[j] = temp;
            }
        }
        System.out.println("希尔排序的结果为:\t");
        for (i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+"\t");
        }
    }
}
