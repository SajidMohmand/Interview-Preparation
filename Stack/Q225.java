package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class MyStack {

    Deque<Integer> q = new ArrayDeque<>();
    public void push(int x) {
        q.addLast(x);
    }

    public int pop() {
        return q.removeLast();
    }

    public int top() {
        if (q.isEmpty()) return -1;
        return q.peekLast();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
public class Q225 {




}
