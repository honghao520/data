package structure.demo3;

/**
 * 树结构
 */
public class ArrayTree {
    int[] arr;

    ArrayTree(int[] arr) {
        this.arr = arr;
    }

    public void fontShow() {
        fontShow(0);
    }

    public void fontShow(int index) {
        if (index >= arr.length) {
            System.out.println("数组越界");
            return;
        }
        if (arr.length == 0 || arr == null) {
            return;
        }
        System.out.println(arr[index]);
        if (index * 2 + 1 < arr.length) {
            fontShow(index * 2 + 1);
        }
        if (index * 2 + 2 < arr.length) {
            fontShow(index * 2 + 2);
        }

    }
}
