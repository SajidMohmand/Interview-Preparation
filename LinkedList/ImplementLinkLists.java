package LinkedList;

class Nodes {
    int val;
    Nodes next;
    Nodes(int val){
        this.val = val;
        this.next = null;
    }
}

public class ImplementLinkLists{
    Nodes head = null;

    void addAtFirst(int val){
        Nodes nNode = new Nodes(val);
        if (head== null){
            head = nNode;
        }else{
            nNode.next = head;
            head = nNode;
        }
    }
    void addAtLast(int val){
        Nodes nNode = new Nodes(val);
        if (head== null){
            head = nNode;
        }else{
            Nodes temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = nNode;
        }
    }
    void deleteFirst(){
        if (head == null) return;
        if (head.next == null){
            head = null;
            return;
        }
        Nodes temp = head.next;
        head = temp;
    }
    void deleteLast(){
        if (head == null) return;
        if (head.next == null){
            head = null;
            return;
        }
        Nodes temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    int remove(int val) {
        if (head == null) return -1;  // Return -1 if the list is empty
        // Special case: removing the first node
        if (head.val == val) {
            head = head.next;
            return val;
        }
        // Traverse the list, looking for the node to remove
        Nodes prev = null;
        Nodes curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;  // Bypass the node
                return val;
            }
            prev = curr;
            curr = curr.next;
        }
        // If we reach here, the value wasn't found
        return -1;
    }

    void reverseList(){

        Nodes prev = null;
        Nodes curr = head;
        Nodes next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    void reverseByRecursion(Nodes prev, Nodes curr, Nodes next){

        if (curr == null){
            head = prev;
            return;
        }

        next = curr.next;
        curr.next = prev;

        prev = curr;
        curr = next;

        reverseByRecursion(prev,curr,next);
    }


    void display(){
        if (head == null){
            System.out.println("!No Data Found");
            return;
        }
        Nodes temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
