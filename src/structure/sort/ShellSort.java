package structure.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 3, 8, 4, 6, 3, 1, 2};
        shellSortTest(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int arr[]) {
        int len = arr.length;
        for (int d = len / 2; d > 0; d /= 2) {
            for (int i = d; i < len; i++) {
                for (int j = i - d; j >= 0; j -= d) {
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
        }
    }

    public static void shellSortTest(int arr[]) {
        int len = arr.length;
        for (int d = len / 2; d > 0; d /= 2) {
            //遍历元素
            for (int i = 0;i<len;i+=d){
                if ((i+d)<len){
                    if (arr[i]>arr[i+d]){
                        int temp = arr[i+d];
                        arr[i+d] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
}
