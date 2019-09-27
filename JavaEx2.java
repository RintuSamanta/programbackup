package com.beginnersbook;
import java.util.*;
public class JavaEx2{
public static void main(String args[]){
LinkedList<String> list=new LinkedList<String>();
//adding elements to the linkedlist
list.add("Ron");
list.add("Nikita");
list.add("Steva");

//adding ann element in the first position

list.addFirst("Negan");

//adding an element in the last position
list.add("Abir");

//adding an element in the third position
list.add(2,"Sonu");

//iterating LinkedList
Iterator<String> iterator=list.iterator();

while(iterator.hasNext()){
System.out.println(iterator.next());
}}}