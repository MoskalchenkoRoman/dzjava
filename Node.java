public class Node {
    int data;
    Node next, prev;
}

class Main
{
    public static Node push(Node head, int key)
    {
        Node node = new Node();
        node.data = key;
        node.prev = null;
        node.next = head;
 
        if (head != null) {
            head.prev = node;
        }
 
        head = node;
        return head;
    }
 
    public static void printDDL(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
 
    public static void swap(Node node)
    {
        Node prev = node.prev;
        node.prev = node.next;
        node.next = prev;
    }
 
    public static Node reverseDDL(Node head)
    {
        Node prev = null;
        Node curr = head;
 
        while (curr != null)
        {
            swap(curr);
            prev = curr;
            curr = curr.prev;
        }
 
        if (prev != null) {
            head = prev;
        }
 
        return head;
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5 };
 
        Node head = null;
        for (int key: keys) {
            head = push(head, key);
        }
 
        printDDL(head);
        System.out.println();
        head = reverseDDL(head);
        printDDL(head);
    }
}
