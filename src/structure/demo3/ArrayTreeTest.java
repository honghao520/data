package structure.demo3;

public class ArrayTreeTest {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,5,8,7,9};
        ArrayTree arrayTree = new ArrayTree(arr);
        arrayTree.fontShow();
        arrayTree.fontShow(5);
        arrayTree.fontShow(10);
    }
}
