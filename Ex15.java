import java.util.Scanner;
public class Ex15{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the first number:");
int a=in.nextInt();
System.out.println("Ennter the second number:");
int b=in.nextInt();
System.out.println("Enter the third number:");
int c=in.nextInt();

if(a>b&&a>c)
	{
	System.out.println("The higgest number is a");
	}
else if(b>a&&b>c)
	{
	System.out.println("The higgest number is b");
	}
else if(c>a&&c>b)
	{
	System.out.println("The higgest number is c");
	}
else{
System.out.println("number is equl");
}
}
}
