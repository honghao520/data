package structure.sort;

import java.util.LinkedList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5,8,7};
        sort(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        List list = new LinkedList();

    }

    static void sort(int arr[]){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i;j<arr.length-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
    }
}
