import java.util.List;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtBegining(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }
    public int length(){
        int count=0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second; //10--->1
        second.next = third;//10--->1--->8
        third.next = fourth;//10-->1-->8-->11
        sll.display();
        System.out.println("Length is " + sll.length());

        sll.insertAtBegining(11);
        sll.insertAtBegining(8);
        sll.insertAtBegining(1);
        sll.display();


    }

}

