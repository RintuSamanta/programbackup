import java.util.*;
class JavaArray10{
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
alist.add(3,"Rintu");
alist.remove("Tim");
//displaying the elements
System.out.println(alist);
}}