package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PushAtBottomOfStack {
    static Stack<Integer> stack = new Stack<>();
    static void pushAtBottom(int value){
        int[] arr = new int[stack.size()];

        int index = 0;

        while (!stack.isEmpty()){
            arr[index] = stack.pop();
            index++;
        }
        stack.push(value);

        for (int i=arr.length-1; i>=0; i--){
            stack.push(arr[i]);
        }
        arr = null;
    }
    static void useRecursion(int value){
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }
        int x = stack.pop();
        useRecursion(value);
        stack.push(x);
    }

    public static void main(String[] args) {
        stack.push(12);
        stack.push(43);
        stack.push(54);
        stack.push(34);
        stack.push(23);


        System.out.println(stack);
//        pushAtBottom(234);
        useRecursion(234);
        System.out.println(stack);
    }
}
