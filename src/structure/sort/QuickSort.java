package structure.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 1, 3, 8, 7};
        quickSort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[], int start, int end) {

        if (start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stard;
            sort(arr, start, low);
            sort(arr, low + 1, end);
        }


    }

    static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            //基准数
            int stard = arr[start];
            //记录开始标
            int low = start;
            //记录结束下标
            int high = end;
            while (low < high) {
                while (low < high && stard < arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && stard > arr[low]) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stard;
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);

        }

    }

    static void quickSort1(int arr[], int start, int end) {
        if (start < end) {
            int index = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (index < arr[high] && low < high) {
                    high--;
                }
                arr[low] = arr[high];
                while (index > arr[low] && low < high) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = index;

            quickSort1(arr, start, low-1);
            quickSort1(arr, low + 1, end);
        }
    }

}
