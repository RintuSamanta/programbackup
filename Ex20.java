import java.util.Scanner;
public class Ex20{
public static void main(String args[]){
int sum=0;
int i;
Scanner in=new Scanner(System.in);

System.out.println("Enter the array's size:");
int n=in.nextInt();
int array[]=new int[n];
System.out.println("Enter the "+n+" numbers");

for(i=0;i<n;i++){
 array[i] = in.nextInt();
}
System.out.println("the printed array:");
	for(i=0;i<n;i++){
System.out.println(array[i]);
			}
System.out.print("Addition of array elements is:  ");
	for(i=0;i<n;i++){
		sum+=array[i];
		}
		System.out.println(sum+ " ");
	
    }
}
