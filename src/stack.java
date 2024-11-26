public class stack {
    private Node top;
    private int size;

    public stack(Node top, int size) {
        this.top = top;
        this.size = size;
    }

    public stack() {
        top = null;
        size = 0;
    }

    public void push(String name, double price) {
        Car car = new Car(name,price);
        Node cc = new Node(car);
        cc.setNext(top);
        top = cc;
        size++;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Car popped from stack: " + top.getCar());
        top = top.getNext();
        size--;
    }

    public void top() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top car is:" + top.getCar());
    }

    public int size() {
        if (size == 0) {
            System.out.println("Stack is empty");
        }
        return size;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public double SummOfPrices() {
        double sum = 0;
        Node ss = top;
        while (ss != null) {
            sum += ss.getCar().getPrice();
            ss = ss.getNext();
        }
        return sum;
    }

}
