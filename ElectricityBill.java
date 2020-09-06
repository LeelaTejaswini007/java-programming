import java.io.*;

class ElecBill{

    private int consumerNum;

    private String consumerName;

    private int prevmonReading;

    private int currmonReading;

    private String ebType;

    public ElecBill(){
  }

    public ElecBill(int consumerNum,String cosumerName,int prevmonReading,int currmonReading,String ebType){

    this.consumerNum=consumerNum;

    this.consumerName=consumerName;

    this.prevmonReading=prevmonReading;

    this.currmonReading=currmonReading;

    this.ebType=ebType;

    }

    public void setConsumerNum(int consumerNum){

        this.consumerNum=consumerNum;

    }

    public void setConsumerName(String consumerName){

        this.consumerName=consumerName;

    }

    public void setPrevmonReading(int prevmonReading){

        this.prevmonReading=prevmonReading;

    }

    public void setCurrmonReading(int currmonReading){

        this.currmonReading=currmonReading;

    }

    public void setEbType(String ebType){

        this.ebType=ebType;

    }

    public int getConsumerNum(){

        return consumerNum;

    }

    public String getConsumerName(){

        return consumerName;

    }

    public int getPrevmonReading(){

        return prevmonReading;

    }

    public int getCurrmonReading(){

        return currmonReading;

    }

    public String getEbType(){

        return ebType;

    }

    public double getBillAmount(){

        double reading=prevmonReading-currmonReading;

        double billAmount=0.0;

        if(ebType=="domestic"){

             if(reading<=100){

                billAmount=reading*1;

             }

             else if(reading>100 && reading<=200){

                 billAmount=reading*2.50;

             }

             else if(reading>200 && reading<=500){

                 billAmount=reading*4;

             }

             else{

                 billAmount=reading*6;

             }

        }
     
   if(ebType=="commercial"){

            if(reading<=100){

                billAmount=reading*2;

             }

             else if(reading>100 && reading<=200){

                 billAmount=reading*4.50;

             }

             else if(reading>200 && reading<=500){

                 billAmount=reading*6;

             }

             else{

                 billAmount=reading*7;

             }

        }

        return billAmount;

    }

}

public class ElectricityBill{

    public static void main(String args[]){

        ElecBill myEb = new ElecBill();

        myEb.setConsumerNum(123);

        myEb.setConsumerName("Ashok");

        myEb.setPrevmonReading(445);

        myEb.setCurrmonReading(205);

        myEb.setEbType("domestic");

        System.out.println(myEb.getBillAmount());
 
   }

}    




