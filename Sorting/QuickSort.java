package Sorting;

public class QuickSort {

    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1; // see again

        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    static void quickSort(int[] arr,int low,int high){
        if (low < high){
            int pivotIdx = partition(arr,low,high);
            quickSort(arr,low,pivotIdx-1);
            quickSort(arr,pivotIdx+1,high);
        }
    }
    static void display(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {3,1,6,2,8,4};
        quickSort(arr,0,arr.length-1);
        display(arr);
    }
}
