package structure.demo8;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 添加节点二叉树排序
     *
     * @param node 插入的节点
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        //如果添加的节点大于当前节点，往右递归
        if (this.value < node.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        } else {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }

        }
        //右旋转
        if (leftHeight() - rightHeight() >= 2) {
            //判断左树子树的左高度和右高度大小 双旋转
            if (left != null && left.leftHeight() < left.rightHeight()) {
                left.leftRotate();
                rightRotate();
            } else {
                //单旋转
                rightRotate();
            }

        }
        //左旋转
        if (leftHeight() - rightHeight() <= -2) {
            //判断右树子树的左高度和右高度大小
            if (right != null && right.rightHeight() < right.leftHeight()) {
                right.rightRotate();
                leftRotate();
            } else {
                //单旋转
                leftRotate();
            }

        }
    }

    /**
     * 右旋转
     */
    private void rightRotate() {
        //创建一个新的当前节点
        Node newNode = new Node(value);
        //把原来的节点放到新的节点的右子树
        newNode.right = right;
        //把原来的节点第一个左儿子的右子树赋值给新节点的左子树
        newNode.left = left.right;
        //把原来的节点的左儿子赋值给root
        value = left.value;
        //把左左儿子与新root连接
        left = left.left;
        //把右子树赋值给当前节点
        right = newNode;

    }

    /**
     * 左旋转
     */
    private void leftRotate() {
        Node newNode = new Node(value);
        newNode.left = left;
        newNode.right = right.left;
        value = right.value;
        right = right.right;
        left = newNode;
    }

    /**
     * 获取左子树高度
     *
     * @return
     */
    private int leftHeight() {
        if (left == null) {
            return 0;
        }
        return left.height();
    }

    /**
     * 获取右子树高度
     *
     * @return
     */
    private int rightHeight() {
        if (right == null) {
            return 0;
        }
        return right.height();
    }


    /**
     * 中序遍历
     */
    public void midShow() {
        if (left != null) {
            left.midShow();
        }
        System.out.println(this.value);
        if (this.right != null) {
            this.right.midShow();
        }
    }

    /**
     * 返回树的高度
     *
     * @return
     */
    public int height() {
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
    }

}
