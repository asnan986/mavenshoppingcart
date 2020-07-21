package org.dxc.shopping;

import java.util.Scanner;

import org.dxc.shopping.exception.ProductException;
import org.dxc.shopping.model.Product;
import org.dxc.shopping.service.*;
import org.dxc.shopping.service.*;

public class ShoppingCart 
{
    public static void main( String[] args ) throws ProductException
    {
         Scanner s = new Scanner(System.in) ;
         Product p;
         CartOperationService cartservice = new CartOperationServiceImpl(10f);
         System.out.println("------------------------------------------");
         System.out.println("Enter the name of the product to remove"); 
         
         String name0 = s.nextLine();
    	 p = new Product(name0, 0, 0);
         cartservice.removeFromCart(p);
         for (int i=1;i<=5;i++) {
        	 System.out.println("------------------------------------------");
        	 System.out.println("Enter the details of the product "+i);
        	 System.out.println("------------------------------------------");
        	 System.out.println("Enter product name ");
        	 String name = s.nextLine();
        	 System.out.println("Enter the price of the product ");
        	 float price = Float.parseFloat(s.nextLine());
        	 System.out.println("Enter the number of quantity needed  ");
        	 int quantity=Integer.parseInt(s.nextLine());;
        	 p = new Product(name, price, quantity);
        	 cartservice.addToCart(p);
        	 
        	 }
         System.out.println("Your invoice amount is "+cartservice.getInvoiceAmount());
         System.out.println("------------------------------------------");
         System.out.println("Enter the name of the product to remove");   
         String name1 = s.nextLine();
    	 p = new Product(name1, 0, 0);
          cartservice.removeFromCart(p);
          System.out.println("No of products in your cart is " + cartservice.getCartSize());
          System.out.println("Your invoice amount is "+cartservice.getInvoiceAmount());
          System.out.println("------------------------------------------");
          
        	  System.out.println("Enter the details of the product to add ");
        	  System.out.println("------------------------------------------");
         	 System.out.println("Enter product name ");
         	 String name = s.nextLine();
         	 System.out.println("Enter the price of the product ");
         	 float price = Float.parseFloat(s.nextLine());
         	System.out.println("Enter the number of quantity needed  ");
         	  int quantity =Integer.parseInt(s.nextLine());
         	 p = new Product(name, price, quantity);
         	 cartservice.addToCart(p);
        	 
         
          System.out.println("------------------------------------------");
        
        System.out.println("The total amount to be paid is "+cartservice.getInvoiceAmount());
        System.out.println("------------------------------------------");
         
    	
    }
}
