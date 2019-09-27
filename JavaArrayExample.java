import java.util.*;
public class JavaArrayExample{
public static void main(String args[]){
ArrayList<String> obj=new ArrayList<String>();
obj.add("Avi");
obj.add("Bulbul");
obj.add("Sana");
obj.add("Abir");
obj.add("Sanglap");
//displaying original arraylist
System.out.println(obj);
for(String str:obj)
System.out.println(str);
 /* Add element at the given index
       * obj.add(0, "Ram") - Adding element "Rahul" at first position
       * obj.add(1, "Justin") - Adding element "Justin" at second position
       */
obj.add(0,"Ram");
obj.add(1,"Justin");
//Displaying arraylist
System.out.println("ArrayList after add operation");
for(String str:obj)
System.out.println(str);

//remove arraylist someone name
obj.remove("Abir");
obj.remove("Justin");

//displaying after remove operation
System.out.println("Arraylist after removing operation");
for(String str:obj)
System.out.println(str);

//remove elements from the specific index
obj.remove(1);
System.out.println("Arraylist after removing specific elements in index");
for(String str:obj)
System.out.println(str);

//displaying last arrayelements
System.out.println("Final Arraylist");
for(String str:obj)
System.out.println(str);
}}