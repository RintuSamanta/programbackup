import java.util.Scanner;
public class Ex7{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
int num=in.nextInt();
for(int i=0;i<10;i++){

	System.out.println(num+"X"+(i+1)+"="+(num*(i+1)));
}
	

}}