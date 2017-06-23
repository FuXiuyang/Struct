package search;

/**
 * Created by fuxiuyang on 17-6-21.
 * 二分查找
 */
public class BinarySearch {

    public static int search(int[] arr, int data){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int middle = (low + high) >> 1;
            if (arr[middle] == data) return middle;
            else if (arr[middle] > data) high = middle -1 ;
            else low = middle + 1 ;
        }

        return -1;
    }

    public static void main(String args[]){
        int[] arr = {0,1,2,3,4,5,5};

        System.out.println(search(arr, 10));
    }
}
