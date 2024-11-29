package Recursion;

public class Q509 {

    static int helper(int n,int a,int b){
        if (n==0){
            return a+b;
        }
        int sum = a + b;
//        System.out.print(sum+" ");
        return helper(n-1,b,sum);
    }
    public static int fib(int n) {

        if (n < 2) return -1;
        if (n == 2) return 1;
//        System.out.print("0 1 ");
        return helper(n-2,0,1);
    }

    public static void main(String[] args) {

        System.out.println(fib(4));
    }
}
