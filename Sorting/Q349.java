package Sorting;

import java.util.HashSet;

public class Q349 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        // Use a HashSet to store unique elements from nums1
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use another HashSet to store the intersection
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
    static void display(int[] arr){
        for (int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]

        int[] res = intersection(new int[]{1,2,2,1},new int[]{2,2});
        display(res);
    }
}
