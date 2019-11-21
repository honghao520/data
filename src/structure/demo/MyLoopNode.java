package structure.demo;

/**
 * 循环链表
 */
public class MyLoopNode {
    //存放数据
    int data;
    //指向下一个地址;
    MyLoopNode next = this;

    public MyLoopNode(int data) {
        this.data = data;
    }

    /**
     * 删除节点
     */
    public void remove() {
        MyLoopNode nodeNext = next.next;
        this.next = nodeNext;
    }

    /**
     *
     * @param newNode   添加的内容
     */
    public void add(MyLoopNode newNode) {
        MyLoopNode myNode = this;
        //原来的下一个节点
        MyLoopNode node = myNode.next;
        myNode.next = newNode;
        newNode.next = node;
    }



    public MyLoopNode next() {
        return this.next;
    }

    public int showData() {
        return this.data;
    }
}
