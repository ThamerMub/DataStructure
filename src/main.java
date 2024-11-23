import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int DS; //data Structure wanted
        
        //start of the menu
        System.out.println("welcome to our Data Structure project.");
        System.out.println("please enter the number of the wanted data Structure: ");
        System.out.println("1. LinkedList.");
        System.out.println("2. Stack.");
        System.out.println("3. Queue.");
        System.out.println("4. Exit.");
        
        
        do{
            DS = input.nextInt();
            switch(DS){
                case 1: //LinkedList's swith-case or menu will be here
                    
                break;
                case 2: // Stack's swith-case or menu will be here
                    
                break;
                case 3://Queue's swith-case or menu will be here
                    
                break;
                case 4: System.out.println("Thank you, have a great day!");
                break;
                default: System.out.println("the input is wrong, please try again.");
            }
        }while(DS != 4);
    }
}
