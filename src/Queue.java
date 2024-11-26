
public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
    
    void enqueue(String name, double price){
        Car c = new Car(name, price);
        Node nn = new Node(c);
        if(front == null){
            front = nn;
            rear = nn;
        }
        else{
            rear.setNext(nn);
            rear = nn;
        }
    }
    
    void enqueueObj(Car c){
        Node nn = new Node(c);
        if(front == null){
            front = nn;
            rear = nn;
        }
        else{
            rear.setNext(nn);
            rear = nn;
        }
    }
    
    Car dequeue(){
        Car temp = front.getCar();
        Node ss = front;
        front = front.getNext();
        ss.setNext(null);
        
        return temp;
        }
    
    
    Car front(){
        return front.getCar();
    }
    
    boolean isEmpty(){
        return (front == null);
    }
    
    int size(){
        Node ss = front;
        int count = 0;
        while(ss != null) {
            count++;
            ss = ss.getNext();
        }
        return count;
    }
    
    void display(){
        Node ss = front;
        if (ss == null) {
            System.out.println("the Queue is Empty.");
        }
        else{
            while(ss != null){
                System.out.println( ss.getCar().getName()+ " - " + ss.getCar().getPrice() + " .");
                ss = ss.getNext();
            }
        }
    }
    
    void applayDiscount(double percentage){
        int target = size();
        Car temp;
        
        if (target == 0) {
            System.out.println("the Queue is Empty.");
        }
        else{
            for (int i = 0; i < target; i++) {
                temp = dequeue();
                temp.setPrice(temp.getPrice() * percentage);
                enqueue(temp.getName(), temp.getPrice());
            }
        }
    }
    
}
