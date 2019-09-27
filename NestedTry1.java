class NestedTry1{
public static void main(String args[]){
try{
	try{
	int b=30/0;
	System.out.println("going to devide");
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);
	}
}
catch(Exception e)
{
System.out.println(e);}
}}