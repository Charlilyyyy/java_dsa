package LinkedList;

public class Single {
    public static void main(String[] args) {
        LinkedList ln1 = new LinkedList();
        ln1.insert(2);
        ln1.insert(3);
        ln1.insert(10);
        ln1.display();
        ln1.search(10);
        ln1.delete(10);
        ln1.search(10);
        ln1.display();
    }
}
