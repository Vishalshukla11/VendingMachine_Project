import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Inventory inventory= new ProductInventory();
        Vendingmachine vendingmachine= new SimpleVendingMachine(inventory);

        //adding some products to the vending machine 
        inventory.addproduct(new SimpleProduct("soda", 20, 10));
        inventory.addproduct(new SimpleProduct("chips ", 10.00, 5));
        inventory.addproduct(new SimpleProduct("Candy", 5.75, 20));

        while(true)
        {
            try{
            System.out.println("Welcome to the vending machine!");
            System.out.println("1. Insert coin");
            System.out.println("2. Select product");
            System.out.println("3. Display Products ");
            System.out.println("4. Exit");

            //read the users choice 
            String input =sc.nextLine().trim();

            if(input.isEmpty())
            {
                throw new InputMismatchException();
            }
            
            int choice=Integer.parseInt(input);
            switch (choice) {
                case 1:
                    System.out.println("Enter amount (e.g., 10 , 20.00):");
                    double amount=Double.parseDouble(sc.nextLine().trim());
                    vendingmachine.insertCoin(new SimpleCoin(amount));
                    break;
                case 2:
                System.out.println("Enter product name:");
               //sc.nextLine();
                String productName =sc.nextLine().trim();
                vendingmachine.dispenseProduct(productName);
                break;
                case 3:
                vendingmachine.displayproducts();
                break;
                case 4:
                System.out.println("Thank you for using the vending machine!");
                sc.close();
            
                default:
                System.out.println("Invalid choice please try again");

                    break;
            }
             } catch (NumberFormatException | InputMismatchException e) {
               System.out.println("Invalid input format .please enter a valid option.");
               sc.nextLine();
            }
        }
    }
 }
