package LinkedList;

public class Q143 {
    public void reorderList(Nodes head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        Nodes slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        Nodes prev = null, curr = slow, temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Step 3: Merge the two halves
        Nodes first = head, second = prev;
        while (second.next != null) {
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }
}
