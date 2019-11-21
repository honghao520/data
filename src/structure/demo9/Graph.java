package structure.demo9;

/**
 * 图结构
 */
public class Graph {
    //顶点集合
    Vertex[] vertices;
    int current = 0;
    //邻接矩阵
    private int[][] adjMat;

    public Graph(int size) {
        vertices = new Vertex[size];
        adjMat = new int[size][size];
    }

    public void add(Vertex vertex) {
        vertices[current++] = vertex;
    }

    public void addEdge(String v1, String v2) {
        //节点在数组中的位置
        int index1 = 0;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].getValue().equals(v1)) {
                index1 = i;
            }
        }
        //节点在数组中的位置
        int index2 = 0;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].getValue().equals(v2)) {
                index2 = i;
            }
        }
        adjMat[index1][index2] = 1;
        adjMat[index2][index1] = 1;
    }
}
