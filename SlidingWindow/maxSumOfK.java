package SlidingWindow;

public class maxSumOfK {
    static int maxSum(int[] arr,int k){
        int left = 0;
        int right = k;

        int res = Integer.MIN_VALUE;
        for (right = k-1; right <arr.length; right++){
            int sum = 0;
            for (int i = left; i<right; i++){
                sum += arr[i];
            }
            if (res < sum){
                res =sum;
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1,2,3,4,5}, 3));
    }
}
