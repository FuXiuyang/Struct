package sort;

/**
 * Created by fuxiuyang on 17-6-21.
 * 冒泡排序
 */
public class BubbleSort {

    public void sort(int[] arr){

        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr.length - i -1; j ++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("冒泡排序结果为:\t");
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+"\t");
        }
    }
}
