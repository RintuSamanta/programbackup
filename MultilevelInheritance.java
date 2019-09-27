class Animal{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
void weep(){System.out.println("weeping...");}
}
class MultilevelInheritance{
public static void main(String args[]){
BabyDog r=new BabyDog();
r.weep();
r.bark();
r.eat();
}
}