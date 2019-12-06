package structure.fib;

public class Fib {
    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.fib(5));
    }


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

}
