import java.io.*;

import java.util.Scanner;

public class BinarySearch{

    public static void main(String args[]){

        char a[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        char key;

        int pos;

        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter the first letter of the word in capitals");

        key=sc.next().charAt(0);

        pos=binarysrch(a,a.length,key);

        if(pos==-1){

            System.out.println("not found");

        }

        else{

            System.out.println(key+" found at the position "+pos);

        }

    }

    public static int binarysrch(char a[],int n,int key){

        int lb,ub,mid;

        lb=0;

        ub=n-1;

        while(lb<=ub){

            mid=(lb+ub)/2;

            if(a[mid]==key)

                return mid;

            else{

                if(a[mid]<key)

                    lb=mid+1;

                else

                    ub=mid-1;

            }

        }

        return (-1);

    }

}

