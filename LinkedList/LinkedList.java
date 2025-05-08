package LinkedList;

class LinkedList {
    // need head , constructor 
    // method : insert , display , search , delete
    Node head;

    LinkedList(){
        head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, make the new node the head
            head = newNode;
        } else {
            // Traverse to the end of the list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Link the new node to the last node
            current.next = newNode;
        }
    }

    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean search(int data){
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true; // Found the data
            }
            current = current.next;
        }
        return false; // Data not found
    }

    public void delete(int data){
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        // Case 1: Delete the head node (if it's the one to be deleted)
        if (head.data == data) {
            head = head.next;  // Move head to the next node
            System.out.println("Deleted " + data + " from the list.");
            return;
        }

        // Case 2: Search for the node to delete
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        // Case 3: If the node wasn't found
        if (current.next == null) {
            System.out.println(data + " not found in the list.");
        } else {
            // Case 4: Delete the node (current.next is the node to delete)
            current.next = current.next.next;
            System.out.println("Deleted " + data + " from the list.");
        }
    }
}
