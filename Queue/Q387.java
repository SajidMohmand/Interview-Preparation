package Queue;

import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class Q387 {

//    public static int firstUniqChar(String s) {
//
//
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i=0; i<s.length(); i++){
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }

    // by using queue
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Update frequency in the HashMap
            map.put(c, map.getOrDefault(c, 0) + 1);
            // Add the index to the queue
            queue.offer(i);

            // Remove characters from the queue with frequency > 1
            while (!queue.isEmpty() && map.get(s.charAt(queue.peek())) > 1) {
                queue.poll();
            }
        }

        // Return the index of the first non-repeating character
        return queue.isEmpty() ? -1 : queue.peek();
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
