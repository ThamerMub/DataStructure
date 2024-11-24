import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int DS; // data Structure wanted
        stack s1 = new stack();
        int StackChoice;
        // start of the menu
        System.out.println("welcome to our Data Structure project.");

        do {
            System.out.println("please enter the number of the wanted data Structure: ");
            System.out.println("1. LinkedList.");
            System.out.println("2. Stack.");
            System.out.println("3. Queue.");
            System.out.println("4. Exit.");

            DS = input.nextInt();
            switch (DS) {
                case 1: // LinkedList's swith-case or menu will be here

                    break;

                case 2: // Stack's swith-case or menu will be here

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
                            case 1:
                                System.out.println("Enter car name:");
                                String name = input.next();
                                System.out.println("Enter Price:");
                                Double price = input.nextDouble();
                                s1.push(name, price);
                                System.out
                                        .println("Car pushed into the stack: " + name + " \nwith the price: " + price);
                                break;

                            case 2:
                                s1.pop();
                                break;
                            case 3:
                                s1.top();
                                break;

                            case 4:
                                System.out.println("Stack size is: " + s1.size());
                                break;

                            case 5:
                                System.out.println(s1.isEmpty());
                                break;
                            case 6:
                                System.out.println("Total prices of all cars in the stack: " + s1.SummOfPrices());
                                break;

                            case 7:
                                System.out.println("Returning to the main menu...");
                                break;

                            default:
                                System.out.println("the input is wrong, please try again.");

                        }
                    } while (StackChoice != 7);

                    break;

                case 3:// Queue's swith-case or menu will be here

                    break;
                case 4:
                    System.out.println("Thank you, have a great day!");
                    break;
                default:
                    System.out.println("the input is wrong, please try again.");
            }
        } while (DS != 4);
        input.close();
    }
}
