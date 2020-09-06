import java.io.*;

import java.util.Scanner;

public class MilkBottles{

         public static void main(String [] args) {

             int a[]={1,5,7,10};

             Scanner sc=new Scanner(System.in);

             System.out.println("enter no of testcases");

             int num=sc.nextInt();

             int output[]=new int[num];

             for(int i=0;i<num;i++){

                 int milk_req=sc.nextInt();

                 int bottles=0;

                 for(int j=3;j>=0;j--){

                     int n=milk_req/a[j];

                     milk_req-=a[j]*n;

                     bottles+=n;

                 }

                 output[i]=bottles;

             }

             for(int i=0;i<num;i++){

                 System.out.println(output[i]);

             }

        }

}

