package com.shoppingcard;

public class ClothingProduct extends Product {
      private String Size;
      private String  brandName;

     ClothingProduct(String ProductNam,int ProductId,double ProductPrice,String Size,String brandName){
       super(ProductNam, ProductId, ProductPrice);
       this.Size= Size;
       this.brandName= brandName;
     }  
     
          public String getSize(){
            return Size;
          }
           public String getBrandName(){
            return brandName;
           }

            @Override

            public void ShowproductInfo(){
                super.ShowproductInfo();
                System.out.println(" Product Size       ="+ Size);
                System.out.println(" Product Brand Name ="+ brandName);
            }

}