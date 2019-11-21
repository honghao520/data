package structure.sort;

public class Han {
    public static void main(String[] args) {
        Han(3, 'A', 'B', 'C');
    }

    /**
     * @param n    有N个盘子
     * @param from 第一个柱子
     * @param in   第二个柱子
     * @param to   第三个柱子
     */
    public static void Han(int n, char from, char in, char to) {
        if (n == 1) {
            System.out.println("把第1个盘子从" + from + "移动到" + to);
        } else {
            Han(n - 1, from, to, in);
            //移动第n个盘子
            System.out.println("把第"+n+"个盘子从" + from + "移动到" + to);
            //移动n-1个盘子到to
            Han(n-1,in,from,to);
        }
    }
}
