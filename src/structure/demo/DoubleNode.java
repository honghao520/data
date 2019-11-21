package structure.demo;

/**
 * 双链表
 */
public class DoubleNode {
    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //存放数据
    int data ;
    public DoubleNode(int data){
        this.data = data;
    }
    //添加节点
    public void after(DoubleNode doubleNode){
        //本来下一个节点
        DoubleNode node = next;
        //当前下一个节点给新的节点
        this.next = doubleNode;
        //新的节点的上一个节点纸箱当前节点
        doubleNode.pre = this;
        //新节点的下一个节点指向原本的下一个节点
        doubleNode.next = node;
        //
        node.pre = doubleNode;
    }
    //查询上一个节点
    public void showPre(){
        DoubleNode doubleNode = this;
        System.out.println(doubleNode.pre.data+" ");
    }
    //查询下一个节点
    public void showNext(){
        DoubleNode doubleNode = this;
        System.out.println(doubleNode.next.data+" ");
    }
    //删除当前节点
    public void delete(){
        //下一个节点
        DoubleNode node = this.next;
        this.pre.next = node;
        node.pre = this.pre;
    }
}
