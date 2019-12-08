package structure.page;

public class DP {
    /**
     * 一个支教三角形，顶部开始一个一个向下找，直到底部输出最大的值。规则只能向下或右下。
     * @param arr
     * @param c 列
     * @param r 行
     * @return  最大路径
     */
    private static int max(int [][]arr,int c,int r){
        for (int i = r-1 ; i>0;i--,c--){
                for (int p = 0 ;p<c-1;p++){
                    arr[i-1][p] = arr[i][p]<arr[i][p+1]?(arr[i-1][p]+arr[i][p+1]):(arr[i-1][p]+arr[i][p]);
            }

    }
        return arr[0][0];
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        System.out.println(max(arr,5,5));
    }

}
