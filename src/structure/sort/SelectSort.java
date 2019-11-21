package structure.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 2, 3, 4, 9, 1};
        selectSort(arr);
        int max= Integer.MIN_VALUE;
        System.out.println(Arrays.toString(arr));
    }

    static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

}
