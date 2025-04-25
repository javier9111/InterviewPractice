package Utils;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        
        Node temp = head;
        Node start = head;
        Node tempStart = null;
        Node end = null;
        Node tempEnd = null;
        Node after = null;
        Node before = null;
        Node prev = null;
        int counter = 0;
        
        
        while(counter < length){
        	
        	if(tempStart !=null && counter<=endIndex){
        		 after = temp.next;
        		 temp.next = before;
                 before = temp;
                 end = temp;
      			 tempEnd = temp;
                 temp = after;
        	}else{
        		if(counter == startIndex){
        			start=temp;
        			tempStart=temp;
        			before=temp;
        		}if(tempStart == null){
        			prev =temp;
        		}
        		temp = temp.next;
        	}
        	counter++;
        	}
        
        start.next=end;
        
        if(startIndex == 0){
        	head = tempEnd;
        	}else {
        		prev.next = tempEnd;
        	}
        
        }
}