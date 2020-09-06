import java.io.*;

import java.util.Scanner;

class Invoi{

        //Define instance variables here

        private String num;

        private String descrip;

        private int quantity;

        private double price;

        //Define parameterized constructor here

        public Invoi(){ 
        }

        public Invoi(String num,String descrip,int quantity,double price){

           this.num=num;

           this.descrip=descrip;

           this.quantity=quantity;

           this.price=price;

        }

       // Setters

        public void setNum(String num){

            this.num=num;

        }

        public void setDescrip(String descrip){

            this.descrip=descrip;

        }

        public void setQuantity(int quantity){

            this.quantity=quantity;

        }

        public void setPrice(double price){

            this.price=price;

        }

       // Getters

       public String getNum(){

           return num;

       }

       public String getDescrip(){

           return descrip;

       }

       public int getQuantity(){

           return quantity;

       }

       public double getPrice(){

           return price;

       }

       public double getInvoiceAmount(){

                double invoiceAmount = 0.0;

                // Write your logic here

                if(quantity<0){

                    quantity=0;

                }

                if(price<=0){

                    price=0.0;

                }

                invoiceAmount=(quantity*price);

                return invoiceAmount;

       }

       

}

public class Invoice{

         public static void main(String []args){

                   Invoi myInvoice=new Invoi();

                   //Write your code here

                   myInvoice.setNum("1");

                   myInvoice.setDescrip("microchip");

                   myInvoice.setQuantity(20);

                   myInvoice.setPrice(60.23);

                   System.out.println(myInvoice.getInvoiceAmount());

         }

}

