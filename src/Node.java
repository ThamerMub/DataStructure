public class Node {
    private Node next;
    private car c1;

    public Node() {
        c1 = null;
        next = null;
    }

    public Node(car c1) {
        this.c1 = c1;
        next = null;
    }

    public Node(car c1, Node next) {
        this.c1 = c1;
        this.next = next;
    }

    public car getC1() {
        return c1;
    }

    public void setC1(car c1) {
        this.c1 = c1;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}