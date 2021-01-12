import java.io.*;
import java.util.*;
public class Exceptions{
   public static void main(String args[]){
      System.out.println("program started");
      Scanner sc=new Scanner(System.in);
      try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
            System.out.println(z);
      }
      catch(InputMismatchException ime){
            System.out.println(ime.toString());
      }
      catch(ArithmeticException ae){
            System.out.println(ae.toString());
      }
      catch(Exception e){
            System.out.println(e.toString());
      }
      finally
      {
            System.out.println("program ended");
      } 
   }
}