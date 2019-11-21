package structure.sort;

import java.util.Arrays;

public class InertSort {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 9, 5, 7, 10};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int index = arr[i + 1];
                int j;
                for (j= i;j>=0&&index<arr[j];j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] = index;

            }
        }
    }
}
