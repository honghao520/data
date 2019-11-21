package structure.demo8;

public class TestBinarySortTree {
    public static void main(String[] args) {
        int [] arr = new int[]{10,6,9,5,7,8};
        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i:arr){
            binarySortTree.add(new Node(i));
        }
        binarySortTree.midShow();//5,6,7,8,9,10
        System.out.println(binarySortTree.height());//3
        System.out.println(binarySortTree.root.value);//7
    }
}
