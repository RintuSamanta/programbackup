import java.util.Scanner;
public class Exm{
public static void main(String args[]){
Scanner in=new Scanner(System.in);

System.out.print("Input first no:");
int num1=in.nextInt();

System.out.print("Input second no:");
int num2=in.nextInt();

System.out.println(num1+"X"+num2+"="+num1*num2);
}
}