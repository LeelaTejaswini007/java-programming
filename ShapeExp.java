abstract class Shape
{
  protected int a;
  protected int b;
  public Shape(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
  public abstract void printArea();
}
class Rectangle extends Shape
{
  public Rectangle(int a,int b)
  {
    super(a,b);
  }
  @Override
  public void printArea()
  {
    System.out.println("Rectangle area is "+a*b);
  }
}
class Triangle extends Shape
{
  public Triangle(int a,int b)
  {
    super(a,b);
  }
  @Override
  public void printArea()
  {
    System.out.println("Triangle area is "+(0.5*a*b));
  }
}
class Circle extends Shape
{
  public Circle(int a,int b)
  {
    super(a,b);
  }
  @Override
  public void printArea()
  {
    System.out.println("Circle area of radius"+a+" is "+(3.14*a*b));
    System.out.println("Circle area of radius"+b+"is"+(3.14*a*b));
  }
}
public class ShapeExp
{
  public static void main(String args[])
  {
    Rectangle R = new Rectangle(10,20);
    Triangle  T = new Triangle(5,10);
    Circle  C = new Circle(8,8);
    R.printArea();
    T.printArea();
    C.printArea();
  }
}