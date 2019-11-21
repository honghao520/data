package structure.demo5HFM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 赫夫曼树
 */
public class TestHuffmanTree {
    public static void main(String[] args) {
        int [] arr = new int[]{3,7,8,5,14,29,23,11};
        creatHfufman(arr);
    }
    static Node creatHfufman(int [] arr){
        List<Node> nodes = new ArrayList<>();
        for (int value:arr){
            nodes.add(new Node(value));
        }

        while (nodes.size()>1) {
            //排序
            Collections.sort(nodes);
            //取出最小的两个二叉树
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);
            //删除这两个二叉树
            nodes.remove(left);
            nodes.remove(right);
            //加起来构成一个新的二叉树
            Node newNode = new Node(left.value + right.value);
            //添加到原来数组中
            nodes.add(newNode);
        }
        System.out.println(nodes);
        return null;
    }

}
