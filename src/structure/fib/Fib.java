package structure.fib;

public class Fib {
    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.fib(46));
        System.out.println(fib.fib2(46));
    }
    //递归
    private static int fib0(int n){
        if (n <3){
            return 1;
        }
        return fib0(n-1)+fib0(n-2);
    }

    //自下而上
    private int fib(int n) {
        int[] arr = new int[n];
        return fib(arr, n);
    }
    private int fib(int[] arr, int n) {
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }


    private int fib1(int n){
        int [] arr = new int [n];
        if (n<3){
            return 1;
        }
        for (int i =0;i<n;i++){
            if (arr[n]!=0){
                return arr[n];
            }
            return fib1(n-1)+fib1(n-2);
        }
        return arr[n];
    }

    //动态数组
    private int fib2(int n ){
        if (n<3){
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 1;i<n;i++){
            second = first +second;
            first = second - first;
        }
        return first;
    }

}
