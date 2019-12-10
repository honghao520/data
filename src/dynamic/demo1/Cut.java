package dynamic.demo1;

/**
 * 有一根n长得绳子,切割成m份,将m根绳子长度相乘求出最大值mxa；
 * 比如n = 8；
 * 则切割成3根 2   3   3  max=18
 * o(n2)
 */
public class Cut {

    public static void main(String[] args) {
        System.out.println(max(100));
    }

    //自己的
    public static int max(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        int[] value = new int[n + 1]; //存放每一个位置存放的最大值;
        value[0] = 0;
        value[1] = 1;
        value[2] = 2;
        value[3] = 3;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                value[i] = Math.max(value[i - j] * value[j], value[i]);
//                value[n] = value[i-j]*value[j]>value[n]?value[i-j]*value[j]:value[n];
            }
        }
        return value[n];
    }

}
