import java.util.Scanner;
public class Ex11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Radius:");
double radius=sc.nextDouble();
double perimeter=Math.PI*(2*radius);
System.out.println("Perimeter is="+perimeter);
double area=Math.PI*(radius*radius);
System.out.println("Area is="+area);
	}
}