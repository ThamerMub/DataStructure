import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int DS; //data Structure wanted for the main switch-case
        
        Queue q = new Queue(); // The Queue
        stack s1 = new stack(); // The Stack
        LinkedList carList = new LinkedList(); // The LinkedList
        
        int queueChoice; // For the wanted operation in Queue
        int StackChoice; // For the wanted operation in Stack
        int linkedListChoice; // For the wanted Operation in LinkedList
        
        //start of the menu
        System.out.println("welcome to our Data Structure project.");
        do{
            System.out.println("\n please enter the number of the wanted data Structure: ");
            System.out.println("1. LinkedList.");
            System.out.println("2. Stack.");
            System.out.println("3. Queue.");
            System.out.println("4. Exit.");
            DS = input.nextInt();
            
            switch(DS){
                case 1: // LinkedList
                    do {
                        System.out.println("\nLinkedList Menu");
                        System.out.println("1. Add Car at Beginning");
                        System.out.println("2. Add Car at End");
                        System.out.println("3. Delete First Car");
                        System.out.println("4. Delete Last Car");
                        System.out.println("5. Search for a Car by price");
                        System.out.println("6. Search for a Car by name");
                        System.out.println("7. Display All Cars");
                        System.out.println("8. Find Car with Maximum Price");
                        System.out.println("9. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        linkedListChoice = input.nextInt();

                        switch (linkedListChoice) {
                            case 1: // Add at first
                                System.out.print("Enter car name: ");
                                String carName1 = input.next();
                                System.out.print("Enter car price: ");
                                double carPrice1 = input.nextDouble();
                                carList.insertAtBeginning(new Car(carName1, carPrice1));
                                break;

                            case 2: // Add at last
                                System.out.print("Enter car name: ");
                                String carName2 = input.next();
                                System.out.print("Enter car price: ");
                                double carPrice2 = input.nextDouble();
                                carList.insertAtEnd(new Car(carName2, carPrice2));
                                break;

                            case 3: // Delete at first
                                carList.deleteFirstNode();
                                break;

                            case 4: // Delete at last
                                carList.deleteLastNode();
                                break;

                            case 5: // Search by Price
                                System.out.print("Enter car price to search: ");
                                int searchPrice = input.nextInt();
                                boolean foundPrice = carList.searchPrice(searchPrice);
                                if (foundPrice) {
                                    System.out.println("Car " + searchPrice + " is in the list.");
                                } else {
                                    System.out.println("Car " + searchPrice + " not found.");
                                }
                                break;
                            case 6: //search by Name
                                System.out.print("Enter car name to search: ");
                                String searchName = input.next();
                                boolean foundName = carList.searchName(searchName);
                                if (foundName) {
                                    System.out.println("Car " + searchName + " is in the list.");
                                } else {
                                    System.out.println("Car " + searchName + " not found.");
                                }
                                break;
                            case 7: // Display
                                carList.displayList();
                                break;

                            case 8: // Find Max
                                Car maxPriceCar = carList.maxPriceCar();
                                if (maxPriceCar != null) {
                                    System.out.println("Car with the maximum price: " +
                                            maxPriceCar.getName() + " ($" + maxPriceCar.getPrice() + ")");
                                }
                                break;

                            case 9: // Return to menu
                                System.out.println("Returning to the main menu...");
                                break;

                            default:
                                System.out.println("Invalid input, please try again.");
                        }
                    } while (linkedListChoice != 9);
                break;
                        
                case 2: // Stack
                    do {
                        System.out.println("\n Stack Menu");
                        System.out.println("1. Push Car to Stack");
                        System.out.println("2. Pop Car from Stack");
                        System.out.println("3. View Top Car");
                        System.out.println("4. Stack Size");
                        System.out.println("5. Check if Stack is Empty");
                        System.out.println("6. Calculate the sum of cars in stack");
                        System.out.println("7. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        StackChoice = input.nextInt();

                        switch (StackChoice) {
                            case 1: // Push
                                System.out.println("Enter car name:");
                                String name = input.next();
                                System.out.println("Enter Price:");
                                Double price = input.nextDouble();
                                s1.push(name, price);
                                System.out.println("Car pushed into the stack: " + name + " with the price: " + price);
                                break;
                            case 2: // Pop
                                s1.pop();
                                break;
                            case 3: // Top
                                s1.top();
                                break;

                            case 4: // Size
                                System.out.println("Stack size is: " + s1.size());
                                break;

                            case 5: // IsEmpty
                                System.out.println(s1.isEmpty());
                                break;
                            case 6: // Calculate the sum
                                System.out.println("Total prices of all cars in the stack: " + s1.SummOfPrices());
                                break;

                            case 7: // Return to menu
                                System.out.println("Returning to the main menu...");
                                break;

                            default:
                                System.out.println("the input is wrong, please try again.");

                        }
                    } while (StackChoice != 7);
                    
                break;
                case 3: // Queue
                    System.out.println("to proform an action on the Queue please enter the number of the operation: ");
                    do{
                        System.out.println("\n Queue Menue");
                        System.out.println("1. Enqueue a car with its price.");
                        System.out.println("2. Dequeue a car.");
                        System.out.println("3. Front of the Queue.");
                        System.out.println("4. Is the Queue Empty");
                        System.out.println("5. Size of the Queue.");
                        System.out.println("6. Display the Queue.");
                        System.out.println("7. applay a discount to the Queue.");
                        System.out.println("8. Back to Main Menu.");
                        queueChoice = input.nextInt();
                        
                        switch(queueChoice){
                            case 1: //Enqueue
                                System.out.println("how many cars you want to add to the Queue?");
                                int target = input.nextInt();
                                
                                for (int i = 0; i < target; i++) {
                                    System.out.println("please enter the name of the car: ");
                                    String carName = input.next();
                                    System.out.println("please enter the price of the car: ");
                                    double carPrice = input.nextDouble();
                                    q.enqueue(carName, carPrice);
                                    System.out.println("Car #" + (i+1) + " has been added");
                                }
                                System.out.println("The operation is done. Please, choose another operation: ");
                            break;
                            case 2: //Dequeue
                                if (q.getFront() == null) {
                                    System.out.println("Error, the Queue is Empty.");
                                    System.out.println("please, choose another operation:");
                                }
                                else{
                                    Car c = q.dequeue();
                                    System.out.println("The object " + c.toString() + " has been Dequeued.");
                                    System.out.println("The operation is done. Please, choose another operation: ");
                                }
                            break;
                            case 3: //Front
                                if (q.getFront() == null) {
                                    System.out.println("Error, the Queue is Empty.");
                                    System.out.println("please, choose another operation:");
                                }
                                else{
                                    Car temp2 = q.front();
                                    System.out.println(temp2.toString() + "Is the object in the front for the Queue.");
                                    System.out.println("The operation is done. Please, choose another operation: ");
                                }
                            break;
                            case 4: //isEmpty
                                if (q.isEmpty()) {
                                    System.out.println("The Queue is Empty");
                                }
                                else{
                                    System.out.println("The Queue is not Empty and has (" + q.size() + ") elements.");
                                }
                                System.out.println("The operation is done. Please, choose another operation: ");
                            break;
                            case 5: //Size
                                System.out.println("The queue has (" + q.size() + ") elements.");
                                System.out.println("The operation is done. Please, choose another operation: ");
                            break;
                            case 6: //Display
                                System.out.println("The Queue consist of the following objects: ");
                                q.display();
                                System.out.println("The operation is done. Please, choose another operation: ");
                            break;
                            case 7: //Applay Discount
                                System.out.println("please enter the discount percenteage: (EX. 30)");
                                double discount = ( input.nextDouble() / 100);
                                q.applayDiscount(discount);
                                System.out.println("The operation is done. Please, choose another operation: ");
                            break;
                            case 8: //return
                                System.out.println("Returning to the main menu...");
                            break;
                            default:System.out.println("The input is wrong, please try again.");
                        }
                    }while(queueChoice != 8);
                break;
                case 4: //Exit 
                    System.out.println("Thank you, have a great day!");
                break;
                default: System.out.println("The input is wrong, please try again.");
            }
        }while(DS != 4);
    }
}
