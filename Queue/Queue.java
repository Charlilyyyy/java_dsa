package Queue;

public class Queue {
    QueueNode root;

    public static void printQueue(Queue queue){
        QueueNode current = queue.root;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (root == null) {
            root = newNode;
        } else {
            QueueNode currNode = root;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public int dequeue() {
        if(root == null) throw new Error("Queue is Empty");
        int firstData = root.data;
        root = root.next;
        return firstData;
    }

    // public boolean isEmpty () {}
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.dequeue();
        printQueue(queue1);
    }
}
