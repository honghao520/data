package structure.demo;

/**
 * 链表
 */
public class MyNode {
    //存放数据
    int data;
    //指向下一个地址;
    MyNode next;

    public MyNode(int data) {
        this.data = data;
    }

    /**
     * 添加节点
     *
     * @Param:node
     */
    public void append(MyNode node) {
        MyNode myNode = this;
        while (true) {
            MyNode nextNode = myNode.next;
            if (nextNode == null) {
                break;
            }
            myNode = nextNode;
        }
        myNode.next = node;
    }

    /**
     * 删除节点
     */
    public void remove() {
        MyNode nodeNext = next.next;
        this.next = nodeNext;
    }

    /**
     *
     * @param newNode   添加的内容
     */
    public void add(MyNode newNode) {
        MyNode myNode = this;
        //原来的下一个节点
        MyNode node = myNode.next;
        myNode.next = newNode;
        newNode.next = node;
    }

    /**
     * 是否是最后一个阶段
     *
     * @return
     */
    public boolean isLast() {
        return next == null;
    }

    /**
     * 显示所有节点信息
     *
     * @return
     */
    public void show() {
        MyNode myNode = this;

        while (true) {
            if (myNode == null) {
                break;
            }
            System.out.print(myNode.data + " ");
            myNode = myNode.next;
        }
    }

    public MyNode next() {
        return this.next;
    }

    public int showData() {
        return this.data;
    }
}
