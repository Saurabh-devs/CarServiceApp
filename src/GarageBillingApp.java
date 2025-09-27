//import java.sql.SQLOutput;
import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------- SSR Car Service Center--------------");

        while (true){
            System.out.println("1. Add Customer");
            System.out.println("2. Display Services");
            System.out.println("3. Exiting");
            System.out.print("Enter your choice : ");


            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Customer Name");
                    String name = sc.next();
                    System.out.println("Enter Customer Phone");
                    String phone = sc.next();
                    System.out.println("Enter Car Number");
                    String carNumber = sc.next();
                    System.out.println("Enter Car Model");
                    String model = sc.next();
                    garageService.addCustomer(name, phone, carNumber, model);
                    break;

                case 2:
                    System.out.println("Enter Car number");
                    String carNo = sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("---Exiting---Thank You---");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }



        }

    }
}
