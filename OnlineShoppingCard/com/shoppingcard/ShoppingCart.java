package com.shoppingcard;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private  HashMap<Integer, Product> cardItem;
      
      ShoppingCart(){
         cardItem= new HashMap<>();

      }


        // add product ()

   public void addProduct(Product product){
      if( cardItem.containsKey(product.getProductId())){
      System.out.println( " Product already exists in cart! ");
   } else{
       cardItem.put(product.getProductId(), product);
       System.out.println("Product added to cart successfully!");
   }
   
   }

     // remove Product()
             
      public void removeProduct(int productId){
           System.out.println();
           if(cardItem.containsKey(productId)){
                cardItem.remove(productId);
                 System.out.println("Product removed from cart successfully!");
           }else{
            System.out.println("Product not found in cart");
           }
      }


      // viewCart()  
       public  void  viewCart(){
           System.out.println();
         if(cardItem.isEmpty()){
            System.out.println(" your card id empty ");
             return;
         }
         for( Map.Entry<Integer,Product>entry : cardItem.entrySet()){
               Product p = entry.getValue();
               p.ShowproductInfo(); 

                System.out.println("           ");
         }
              System.out.println(cardItem.size());
        }



   // total price 
     
     public double totalPrice(){
         double total=0;
        for(Product p : cardItem.values()) {
             total += p.getProductPrice();
        }
         return total;
     }


   }


