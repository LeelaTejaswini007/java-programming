import java.io.*;

import java.util.Scanner;

public class GamefNumbers{

          public static void main(String []args) {

             //Write your code here
   
          Scanner sc=new Scanner(System.in);

             int N=sc.nextInt();

             int num_list[]=new int[N];

             int k=0;

             for(int i=0;i<N;i++){

                 num_list[i]=sc.nextInt();

             }

             
for(int i=0;i<N;i++){

                 k=k^num_list[i];

             }

             
if(k==0){

                 System.out.println("JASBIR");

             }

             
else{

                 System.out.println("AMAN");

             }

          }

}
