package com.shoppingcard;

public class ElectronicProduct  extends Product{
         private String brandName;
        private int warrantyPeriod;


         public ElectronicProduct(String ProductNam,int ProductId,double ProductPrice,String brandName,int warrantyPeriod ){
              super(ProductNam, ProductId, ProductPrice);
               this.brandName= brandName;
               this.warrantyPeriod=warrantyPeriod;
         }

          public String getBandNam(){
             return brandName;
          }

           public int getWarranty(){
             return warrantyPeriod;
           }

           @Override
         public void ShowproductInfo(){
            super.ShowproductInfo();
            System.out.println(" Product Brand Name = "+ brandName);
            System.out.println(" Product Warranty   =  "+ warrantyPeriod);
         }
}
