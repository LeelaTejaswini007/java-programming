import java.io.*;

public class Spiral{

         public static void main(String []args){

                  int a[][]  = new int[5][5];

                  int val=1;

                  int k=0,m=0;

                  int l=4,n=4;

                  while(val<=25){

                      for(int i=k;i<=l;i++){

                          a[m][i]=val;

                          val++;

                      }

                      for(int i=m+1;i<=n;i++){

                          a[i][l]=val;

                          val++;

                      }

                      for(int i=l-1;i>=k;i--){

                          a[n][i]=val;

                          val++;

                      }

                      for(int i=n-1;i>=m+1;i--){

                          a[i][k]=val;

                          val++;

                      }

                      k++;

                      m++;

                      l--;

                      n--;

                  }

                   for(int i=0;i<5;i++) {

                      for(int j=0;j<5;j++) {

                          System.out.print(String.valueOf(a[i][j] +"\t"));

                      }

                      System.out.println();

                 }

       }

}

