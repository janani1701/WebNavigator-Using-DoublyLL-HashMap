public class DoublyLinkedList {
    public ListNode tail;
    private ListNode head;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void addPage(String url) {
        ListNode newNode = new ListNode(url);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayHistory() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.url);
            current = current.next;
        }
    }
}

