public class Main{
    /* Create Node for Linked List*/
    static class Node{
        int data;
        Node next;
            Node(int val){
                data = val;
                next = null;
            }
    }
    
    /* Create static variable head */
    static Node head = null;
    
    /* Delete any Node given value */
    static void deleteNode(int n){
               
        if(head == null){
            return;
        }
        if(head.data == n){
            head = head.next;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != n){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }
    
    /* Remove Last Node */
    static void deleteLast(){
                
        if(head == null || head.next == null){
            head = null;
            return;
        }
        
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    
    /* Remove First Node*/
    static void deleteFirst(){
        if(head == null)
            return;
        head = head.next;
    }
    
    /* Add last in Last */
    static void addNode(int n){
                
        if(head == null){
            head = new Node(n);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(n);
    }
    
    /* Add Node in First */
    static void addFirst(int n){
        Node new_node = new Node(n);
        new_node.next = head;
        head = new_node;
    }
    
    /* Print all Node */
    static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" "+ temp.next);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        Node n1 = new Node(12);
        Node n2 = new Node(102);
        Node n3 = new Node(120);
        Node n4 = new Node(122);
        
       
        head = n1;
        head.next = n2;
        head.next.next = n3;
        head.next.next.next = n4;
        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);

        addNode(45);
               
        // deleteFirst();
        // deleteLast();
        printList();
        // deleteNode(102);
        addFirst(1998);
        printList();
        
        

        // while(head != null){
        //     System.out.println(head.data);
        //     head = head.next;
        // }
    }
}
