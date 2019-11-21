package structure.demo8;

/**
 * 平衡二叉树
 */
public class BinarySortTree {
    Node root;

    /**
     * 添加节点
     * @param node 节点
     */
    public void add(Node node) {
        //如果是个空树
        if (root == null) {
            root=node;
        }else {
            root.add(node);
        }

    }
    public void midShow(){
        if (root==null){
            return;
        }else {
            root.midShow();
        }

    }
    public int height(){
        return root.height();
    }
}
