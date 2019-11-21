package structure.demo;

public class MyNodeTest {
    public static void main(String[] args) {
        MyNode node1 = new MyNode(1);
        MyNode node2 = new MyNode(2);
        MyNode node3 = new MyNode(3);
        MyNode node4 = new MyNode(4);
        node1.append(node2);
        node1.append(node3);
        node1.append(node4);
        node2.remove();
        node1.show();
        node1.next.next.add(node3);
        node1.show();
    }
}
