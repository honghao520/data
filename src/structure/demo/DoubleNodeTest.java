package structure.demo;

public class DoubleNodeTest {
    public static void main(String[] args) {
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        DoubleNode n4 = new DoubleNode(4);
        n1.after(n2);
        n2.after(n3);
        n3.after(n4);
        n3.showNext();//4
        n4.showNext();//1
        n3.showPre();//2
        n3.delete();
        n2.showNext();//4
    }
}
