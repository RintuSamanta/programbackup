import java.util.Scanner;
public class Ex18{
public static void main(String args[]){

Scanner in=new Scanner(System.in);
int i,j,n,k=1;
System.out.println("Enter the n digit");
n=in.nextInt();
	for(i=1;i<=n;i++)
	{
	for(j=1;j<=i;j++)
	System.out.print(k++);
System.out.println("");
	}
}
}