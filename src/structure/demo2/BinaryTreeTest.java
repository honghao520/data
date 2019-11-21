package structure.demo2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);
        TreeNode rootR = new TreeNode(3);
        TreeNode rootL = new TreeNode(2);
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        //为左节点再创建2个节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为右节点再创建2个节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));

        //前序遍历
        binaryTree.frontShow();
        System.out.println();
        //中序遍历
        binaryTree.midShow();
        //前序查找
        TreeNode result = binaryTree.frontSearch(3);
        System.out.println(result==rootR);

        //删除节点
        binaryTree.remove(2);
        binaryTree.frontShow();

    }
}
