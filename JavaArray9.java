import java.util.*;
class JavaArray9{
public static void main(String args[]){
ArrayList<String> alist=new ArrayList<String>();
alist.add("Steve");
alist.add("Tim");
alist.add("Lucy");
alist.add("Pat");
alist.add("Angela");
alist.add("Tom");
//displaying elements
System.out.println(alist);

//Adding Steve at the forth position
alist.add(3,"Steva");

//displaying the elements
System.out.println(alist);
}}