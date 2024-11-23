import java.util.*;
public class Q169 {
    public static int majorityElement(int[] nums) {
        int count = 1;

        for (int i=1; i<nums.length; i++) {
            if (count == 0) {
                nums[0] = nums[i];
            }
            count += (nums[0] == nums[i]) ? 1 : -1;
        }
        return nums[0];
    }

    public static void main(String[] args) {
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));

    }
}