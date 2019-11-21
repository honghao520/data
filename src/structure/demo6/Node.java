package structure.demo6;

public class Node implements Comparable<Node>{
    Byte data;//字节码
    int weight;//权值
    Node left;
    Node right;
    public Node(Byte data,int weight){
        this.data= data;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return o.weight-this.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "weight=" + weight +
                '}';
    }
}
