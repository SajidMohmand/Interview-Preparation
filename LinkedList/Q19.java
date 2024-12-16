package LinkedList;
public class Q19 {

    public static Nodes removeNthFromEnd(Nodes head, int n) {
        int size = getSize(head);
        int i = size-n+1;
        Nodes prev = null;
        Nodes curr = head;
        while (i != 1){
            prev = curr;
            curr = curr.next;
            i--;
        }
        Nodes res = curr;
        prev.next = curr.next;
        return res;
    }
    static int getSize(Nodes head){
        int size = 0;
        if(head == null) return size;
        Nodes temp = head;
        while (temp != null){
            size++;
            temp= temp.next;
        }
        return size;
    }

    public static void main(String[] args) {
        ImplementLinkList ll = new ImplementLinkList();
        ll.addAtLast(1);
        ll.addAtLast(2);
        ll.addAtLast(3);
        ll.addAtLast(4);
        ll.addAtLast(5);

        Nodes n = removeNthFromEnd(ll.head,4);
        System.out.println(n.val);
        ll.display();
    }
}
