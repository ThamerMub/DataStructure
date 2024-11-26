public class Node {
    private Car car;
    private Node next;
    
    public Node(){
        car = null;
        next = null; 
    }
    
    public Node(Car car){
        this.car = car;
        next = null;
    }
    
    public Node(Car car, Node next){
        this.car = car;
        this.next = next;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
