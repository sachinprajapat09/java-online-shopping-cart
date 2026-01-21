package com.shoppingcard;

public class Product {
    private String  ProductNam;
    private int  ProductId;
    private double ProductPrice;

         

      Product(String ProductNam, int ProductId,double ProductPrice){
        this.ProductId=ProductId;
        this.ProductNam=ProductNam;
        this.ProductPrice=ProductPrice;

      }

         public String  getProductNam(){
            return ProductNam;
         }

         public int getProductId(){
            return ProductId;

         }

          public double getProductPrice(){
            return ProductPrice;
          }

            public void ShowproductInfo(){
                System.out.println(" Product Name  = "+ProductNam);
                System.out.println(" Product Id    = "+ProductId);
                System.out.println(" Product Price = "+ProductPrice);
            }
}
