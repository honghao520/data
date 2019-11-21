package structure.demo6;

import java.util.*;

/**
 * 赫夫曼编码
 */
public class TestHuffmanCode {

    public static void main(String[] args) {
        String msg = "can a can you can not can c";
        byte[] bytes = msg.getBytes();
        System.out.println(Arrays.toString(bytes));
        //进行赫夫曼编码
        byte[] by = huffmanZip(bytes);
        //使用赫夫曼解码
        byte[] byt = huffmanCodes(by, huffCodes);
        System.out.println(new String(byt));

    }

    private static byte[] huffmanCodes(byte[] by, HashMap<Byte, String> huffCodes) {
        StringBuilder sb = new StringBuilder();
        //把byte数组转换成二进制字符串
        for (int i =0;i<by.length;i++){
            byte b = by[i];
            boolean flag = (i==by.length-1);
            sb.append(bytToBitStr(!flag,b));
        }
        //把赫夫曼键值对调换
        HashMap<String,Byte> map = new HashMap<>();
        for (Map.Entry<Byte, String> entry:huffCodes.entrySet()){
            map.put(entry.getValue(),entry.getKey());
        }
        //处理字符串
        List <Byte> byteList = new ArrayList();
        for (int i = 0;i<sb.length();){
            int count = 1;
            boolean flag = true;
            while (flag){
                String str = sb.substring(i,i+count);
                if (map.get(str)==null){
                    count++;
                }else {
                    byteList.add(map.get(str));
                    i +=count;
                    flag = false;
                }
            }
        }
        //创建byte
        byte []byt = new byte[byteList.size()];
        for (int i = 0;i<byt.length;i++){
            byt[i] = byteList.get(i);
        }

        return byt;
    }

    static String bytToBitStr(boolean flag,byte b){
        int temp = b;
        if (flag) {
            temp |= 256;
        }
        if (flag){
            String str = Integer.toBinaryString(temp);
            return str.substring(str.length()-8);
        }else {
            return Integer.toBinaryString(b);
        }
    }


    /**
     * 通过赫夫曼编码压缩
     *
     * @param bytes
     * @return
     */
    private static byte[] huffmanZip(byte[] bytes) {
        //先统计每一个byte出现的次数，并放入一个集合中
        List<Node> nodes = getNodes(bytes);
        //创建一个赫夫曼树
        Node tree = creatHuffman(nodes);
        //创建赫夫曼表
        HashMap<Byte, String> codes = getCodes(tree);

        //编码
        byte[] b = zip(bytes, codes);
        return b;
    }

    /**
     * 进行赫夫曼编码
     *
     * @param bytes
     * @param codes
     * @return
     */
    private static byte[] zip(byte[] bytes, HashMap<Byte, String> codes) {
        StringBuilder sb = new StringBuilder();
        //把需要压缩的byte数组，处理成二进制文件
        for (Byte b : bytes) {
            sb.append(codes.get(b));
        }
        //判断长度
        int len;
        if (sb.length() % 8 == 0) {
            len = sb.length() / 8;
        } else {
            len = sb.length() / 8 + 1;
        }
        //用于存储压缩后的byte
        byte[] by = new byte[len];
        //临时保存8位
        String str;
        int index = 0;
        for (int i = 0; i < sb.length(); i += 8) {
            if (i + 8 > sb.length()) {
                str = sb.substring(i);

            } else {
                str = sb.substring(i, i + 8);
            }
            byte byt = (byte) Integer.parseInt(str, 2);
            by[index] = byt;
            index++;
        }

        return by;
    }

    //用于临时存储路径
    static StringBuilder sb = new StringBuilder();
    //存储赫夫曼编码表
    static HashMap<Byte, String> huffCodes = new HashMap<>();

    /**
     * 通过赫夫曼树生成赫夫曼表
     *
     * @param tree 赫夫曼树
     * @return
     */
    private static HashMap<Byte, String> getCodes(Node tree) {
        if (tree == null) {
            return null;
        }
        getCodes(tree.left, "0", sb);
        getCodes(tree.right, "1", sb);
        return huffCodes;
    }

    /**
     * 递归生成
     *
     * @param node
     * @param code
     * @param sb
     */
    private static void getCodes(Node node, String code, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.append(code);
        if (node.data == null) {
            getCodes(node.left, "0", sb2);
            getCodes(node.right, "1", sb2);
        } else {
            huffCodes.put(node.data, sb2.toString());
        }
    }

    /**
     * 把数组创建成赫夫曼树
     *
     * @param nodes
     * @return
     */
    private static Node creatHuffman(List<Node> nodes) {
        while (nodes.size() > 1) {
            //排序
            Collections.sort(nodes);
            //把最小的两个节点取出
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);
            //添加这最小的两个节点和到数组中
            Node parent = new Node(null, left.weight + right.weight);
            parent.right = right;
            parent.left = left;
            //删除最小的两个节点
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
            //循环
        }
        return nodes.get(0);
    }

    /**
     * 把bytes数组变成node集合
     *
     * @param bytes
     * @return
     */
    private static List<Node> getNodes(byte[] bytes) {
        List<Node> nodes = new ArrayList<>();
        HashMap<Byte, Integer> counts = new HashMap<>();
        //统计每个byts出现的次数
        for (byte by : bytes) {
            Integer count = counts.get(by);
            if (count == null) {
                counts.put(by, 1);
            } else {
                counts.put(by, count + 1);
            }
        }
        //把每一个键值对转化成node对象
        for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        return nodes;
    }


}
