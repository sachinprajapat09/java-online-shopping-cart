package com.shoppingcard;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          ShoppingCart cart = new ShoppingCart();
  
             int choice; 
                
              do{

            System.out.println("\n===== ONLINE SHOPPING CART =====");
            System.out.println("1. Add Electronic Product");
            System.out.println("2. Add Clothing Product");
            System.out.println("3. View Cart");
            System.out.println("4. Remove Product");
            System.out.println("5. Total bill ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

                choice = sc.nextInt();
               
                 try{
                    switch (choice) {
                        case 1:
                                // Add Electronic Product      
                                System.out.print("Entar tha Product Name: "); 
                                sc.nextLine();  
                                 String ename = sc.nextLine();
                                
                                  System.out.print("Enter Product ID: ");
                                   int eId = sc.nextInt();


                                 System.out.print("Enter Product Price: ");
                                 double ePrice = sc.nextDouble(); 

                                 System.out.print("Enter Brand Name: ");
                                 String brand = sc.next();

                                 System.out.print("Enter Warranty (months): ");
                                int warranty = sc.nextInt();


                                   Product ep = new ElectronicProduct(ename, eId, ePrice, brand, warranty);

                                    cart.addProduct(ep);
                            break;

                            case 2:
                                // add Clothing 

                                  System.out.print("Enter Product name: ");
                                  sc.nextLine();  
                                  String cname  = sc.nextLine();

                                   System.out.print("Enter  Product id: ");
                                    int  cId = sc.nextInt();

                                    System.out.print("Enter Product Price: ");
                                    double cPrice= sc.nextDouble();
                                    sc.nextLine();

                                     System.out.print("Enter a Size: ");
                                     String Size= sc.nextLine();

                                     System.out.print("Enter a Brand name: ");
                                      String cbrand = sc.nextLine();

                                       Product cp= new ClothingProduct(cname, cId, cPrice, Size, cbrand);
                                        cart.addProduct(cp);

                                         break;

                                 
                       case 3 : 

                        cart.viewCart();
                         break;



                         case 4:
                            System.out.println("Enter Remove product id ");
                            int rid= sc.nextInt();
                             cart.removeProduct(rid);
                                 break;

                        case 5:
                            System.out.println("Your total bill " );
                            double total=  cart.totalPrice();
                             System.out.println("Total bill = "+ total);
                                 break;
                         case 6:
                        

                         System.out.println(" Bye bye good bye");
                          break;

                        default:
                            System.out.println("Invalid choice! Try again");
                            break;
                 
                        }
                    }catch(Exception e){
                        System.out.println("Input Error: Please enter valid data!");
                         sc.nextLine();
                    }
        } while (choice !=6);
            
        sc.close();
              
    }
}
