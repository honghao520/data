package structure.demo5HFM;

public class Node implements Comparable<Node>{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        return -(this.value-o.value);
    }
}
