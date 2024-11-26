public class LinkedList {
    private Node head; // Head of the list

    public LinkedList() {
        this.head = null;
    }

    // Insert at the beginning of the list
    public void insertAtBeginning(Car car) {
        Node ss = new Node(car);
        ss.setNext(head);
        head = ss;
        System.out.println("Inserted " + car.getName() + " at the beginning.");
    }

    // Insert at the end of the list
    public void insertAtEnd(Car car) {
        Node ss = new Node(car);
        if (head == null) {
            head = ss;
            System.out.println("Inserted " + car.getName() + " at the end.");
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(ss);
        System.out.println("Inserted " + car.getName() + " at the end.");
    }

    // Delete the first node
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Deleted first node with car " + head.getCar().getName() + ".");
        head = head.getNext();
    }

    // Delete the last node
    public void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.getNext() == null) {
            System.out.println("Deleted last node with car " + head.getCar().getName() + ".");
            head = null;
            return;
        }
        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        System.out.println("Deleted last node with car " + temp.getNext().getCar().getName() + ".");
        temp.setNext(null);
    }

    // Search for a node by car price
    public boolean searchPrice(int targetPrice) {
        Node current = head;
        while (current != null) {
            if (current.getCar().getPrice() == targetPrice) {
                System.out.println("Found car: " + current.getCar().getName() + " with price $" + targetPrice);
                return true;
            }
            current = current.getNext();
        }
        System.out.println("Car with price $" + targetPrice + " not found.");
        return false;
    }

    public boolean searchName(String targetName) {
        Node current = head;
        while (current != null) {
            if (current.getCar().getName().equalsIgnoreCase(targetName)) { 
                return true;   
            }
            current = current.getNext();
        }
       return false;
        
    }

    // Display the list
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.getCar().getName() + " -> ");
            temp = temp.getNext();
        }
    }

    // Get the maximum price of a car in the list
    public Car maxPriceCar() {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        Node temp = head;
        Car maxCar = head.getCar();
        while (temp != null) {
            if (temp.getCar().getPrice() > maxCar.getPrice()) {
                maxCar = temp.getCar();
            }
            temp = temp.getNext();
        }
        return maxCar;
    }
}
