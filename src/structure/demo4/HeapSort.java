package structure.demo4;

import java.util.Arrays;

/**
 * 大堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 8, 7, 0, 1, 10, 4,2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int [] arr){
        int start = (arr.length - 1) / 2;
        //循环变为大顶堆
        for (int i = start; i >= 0; i--) {
            maxHeap(arr,arr.length, i);
        }
        //取出根节点，放到数组最后，再对之前的数组进行操作
        for (int i = arr.length-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr,i,0);
        }
    }
    /**
     * 子树进行大小比较并交换
     * @param arr   放入数组
     * @param index 第几个非叶子节点开始比较
     */
    public static void maxHeap(int[] arr,int size, int index) {
        //左子树
        int leftNode = index * 2 + 1;
        //右子树
        int rightNode = index * 2 + 2;
        //最大的节点位置
        int max = index;
        //父节点和右儿子比较大小
        if (size > rightNode && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        //父节点和左儿子比较大小
        if (size > leftNode && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        //交换节点,重新构建大顶
        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            maxHeap(arr, size,max);
        }

    }
}
