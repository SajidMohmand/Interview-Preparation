package LinkedList;

public class Q234 {

    static Nodes reversell(Nodes head){
        Nodes prev = null;
        Nodes curr = head;
        Nodes nex;
        while (curr != null){
            nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
        }
        return prev;
    }
    public static boolean isPalindrome(Nodes head){

        Nodes slow = head;
        Nodes fast = head;
        int size = 0;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Nodes head2 = reversell(slow);
        Nodes temp = head;
        Nodes temp2 = head2;

        while (temp2 != null){
            if (temp2.val != temp.val){
                reversell(head2);
                return false;
            }
            temp2 = temp2.next;
            temp = temp.next;
        }
        reversell(head2);
        return true;
    }

    public static void main(String[] args) {
        ImplementLinkList ll = new ImplementLinkList();

        ll.addAtLast(1);
        ll.addAtLast(2);
        ll.addAtLast(3);
        ll.addAtLast(1);

        System.out.println(isPalindrome(ll.head));


        ll.display();
    }
}
