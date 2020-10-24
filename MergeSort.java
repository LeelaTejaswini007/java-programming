import java.io.*;
import java.util.Scanner;
public class MergeSort
{
  public static void main(String args[])
  {
    int a[];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size");
    int n = sc.nextInt();
    a = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("\n before sorting");
    display(a);
    mergePass(a,0,n-1);
    System.out.println("\n after sorting");
    display(a);
  }
  public static void mergePass(int a[],int lb,int ub)
  {
    int mid;
    if(lb!=ub)
    {
      mid=(lb+ub)/2;
      mergePass(a,lb,mid);
      mergePass(a,mid+1,ub);
      mergeSort(a,lb,mid,ub);
    }
  }
  public static void mergeSort(int a[],int lb,int mid,int ub)
  {
    int i,j,k;
    int temp[];
    temp=new int[20];
    i=lb;
    j=mid+1;
    k=lb;
    while((i<=mid)&&(j<=ub))
    {
      if(a[i]<=a[j])
      {
        temp[k]=a[i];
        k++;
        i++;
      }
      else
      {
        temp[k]=a[j];
        k++;
        j++;
      }
    }
    while(i<=mid)
    {
      temp[k]=a[i];
      k++;
      i++;
    }
    while(j<=ub)
    {
      temp[k]=a[j];
      k++;
      j++;
    }
    for(i=lb;i<=ub;i++)
    {
      a[i]=temp[i];
    }
  }
  public static void display(int a[])
  {
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]+" ");
  }
}