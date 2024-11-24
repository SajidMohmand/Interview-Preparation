package Sorting;
import java.util.*;
public class Q242 {
    public static boolean isAnagram(String s, String t) {

        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);

        return Arrays.equals(sa,ta);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
