package Sorting;

public class ExtractDuplicate {
    static void sortDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int val = arr[start];
        for (start = 1; start<=end; start++){
            while (val == arr[start]){
                arr[start] = arr[end];
                val = arr[start];
                arr[end] = -1;
                end--;
            }
        }
    }
    static void display(int[] arr){
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {2,2,4,5,6};
//        sort(arr);
        display(arr);
    }
}
