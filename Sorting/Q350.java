package Sorting;

import java.util.*;
public class Q350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return intersection.stream().mapToInt(i -> i).toArray();
    }
    static void display(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2,2]

        int[] arr = intersect(new int[]{1,2,2,1}, new int[]{2,2});
        display(arr);
    }
}
