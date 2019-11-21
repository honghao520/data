package structure.demo;

public class MyLoopNodeTest {
    public static void main(String[] args) {
        MyLoopNode loopNode1 = new MyLoopNode(1);
        MyLoopNode loopNode2 = new MyLoopNode(2);
        MyLoopNode loopNode3 = new MyLoopNode(3);
        MyLoopNode loopNode4 = new MyLoopNode(4);
        loopNode1.add(loopNode2);
        System.out.println(loopNode2.next().showData());

    }
}
