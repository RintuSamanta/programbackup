import java.util.*;
class JavaIterating{
public static void main(String args[]){
ArrayList<String> alist=new ArrayList <String>();
alist.add("Gregor Clegate");
alist.add("Saheb Pahar");
alist.add("Rintu Samanta");
alist.add("Laxmikanta Samanta");
alist.add("Payal Samanta");

//displaying array list

System.out.println(alist);

//iterating Arraylist

for(String str:alist)
System.out.println(str);

}}