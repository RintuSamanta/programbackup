import java.util.Arrays;
public class Ex19{
public static void main(String args[]){

int[] my_array1={1,5,7,6,4,3};
String[] my_array2={"r","y","a","m","c"};
System.out.println("Original array:"+Arrays.toString(my_array1));
Arrays.sort(my_array1);
System.out.println("Sorted array:"+Arrays.toString(my_array1));

System.out.println("Original array:"+Arrays.toString(my_array2));
Arrays.sort(my_array2);
System.out.println("Sorted array:"+Arrays.toString(my_array2));



}
}