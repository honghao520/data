package structure.demo7;

import java.util.*;

public class TestBinarySortTree {
    public static void main(String[] args) {
        int [] arr = new int[]{5,7,6,2,4,3};
        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i:arr){
            binarySortTree.add(new Node(i));
        }

        binarySortTree.midShow();
        Set set = new HashSet();
    }
}
