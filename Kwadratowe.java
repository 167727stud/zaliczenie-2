import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Kwadratowe {
  public static void kwadratowe() {
    double a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.print("a=");
    a=sc.nextFloat();
    System.out.print("b=");
    b=sc.nextFloat();
    System.out.print("c=");
    c=sc.nextFloat();
    if(a==0) 
      liniowe(b,c);
    else{
      double delta;
      delta=b*b-4*a*c;
      if(delta<0)
        System.out.println("Brak rozwiązań");
      else
      if(delta==0){
        double x;
        x=-b/(2*a);
        System.out.print("oba pierwiastki są sobie równe");
        System.out.println(x);
      }
      else{
        double x1, x2;
        x1=(-b+sqrt(delta))/(2*a);
        x2=(-b-sqrt(delta))/(2*a);
        System.out.print("x1 = ");
        System.out.println(x1);
        System.out.print("x2 = ");
        System.out.println(x2);
      }
    }
  }
  static void liniowe(double a, double b){
    if(a==0)
      if(b==0)
        System.out.println("rownanie nie jest kwadratowe");
      else
        System.out.println("rownanie nie jest kwadratowe");
    else{
      double x;
      x=-b/a;
      System.out.print("równianie jest liniowe x = ");
      System.out.println(x);
    }
  }
}