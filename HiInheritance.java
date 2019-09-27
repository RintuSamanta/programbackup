class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class HiInheritance{  
public static void main(String args[]){  
Cat c=new Cat(); 
Dog m=new Dog(); 
c.meow();  
c.eat();  
m.bark(); 
}}  