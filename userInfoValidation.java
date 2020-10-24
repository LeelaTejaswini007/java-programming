import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
class Info
{
  private String user_name;
  private String number;
  private String mail_id;
  private String password;
  
  public Info(){ }
  
  public Info(String user_name,String number,String mail_id,String password)
  {
    this.user_name=user_name;
    this.number=number;
    this.mail_id=mail_id;
    this.password=password;
  }
  public void isvalidusername()
  {
    String regex="[a-zA-Z]+";
    if(user_name.matches(regex))
      System.out.println("valid user name");
    else
      System.out.println("INVALID user name");
  }
  public void isvalidnumber()
  {
    if(number.matches("[789]{1}[0-9]{9}"))
      System.out.println("vaild mobile number");
    else
      System.out.println("INVALID mobile number");
  }
  public void isvalidmailid()
  {
    String regex = "@gmail.com";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(mail_id);
    if(matcher.find())
      System.out.println("valid mail id");
    else
      System.out.println("INVALID mail id");
  }
  public boolean isvalidpassword()
  {
    String regex = "^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=])"+"(?=\\s+$).{8,20}$";
    Pattern p = Pattern.compile(regex);
    if(password==null)
    {
      return false;
    }
    Matcher m = p.matcher(password);
    return m.matches();
  }
}
public class UserInfoValidation
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the name");
    String name = sc.nextLine();
    System.out.println("enter the moblie number");
    long num=sc.nextLong();
    String num1=String.valueOf(num);
    System.out.println("enter your gmail id");
    String mail = sc.next();
    System.out.println("enter the password following below instructions");
    System.out.println("password must have :\n contain at least 8 characters and at most 20 characters\n contain at least one digit.\n have at least one upper letter");
    String password = sc.next();
    Info user1 = new Info(name,num1,mail,password);
    user1.isvalidusername();
    user1.isvalidnumber();
    user1.isvalidmailid();
    if(user1.isvalidpassword()){System.out.println("valid password");}
    else{System.out.println("INVALID password");}
  }
}