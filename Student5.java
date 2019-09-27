class Student5{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student5(int i,String n,int b){  
    id = i;  
    name = n;
    age = b; 
  
    }  
    //creating three arg constructor  
    Student5(String n,int a,int i){   
    name = n;  
    age=a; 
    id =  i;
    } 
     Student5(){}
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student5 s1 = new Student5(111,"Karan",67);  
    Student5 s2 = new Student5("Aryan",876,25);  
    Student5 s3 = new Student5();
    s3.id=s1.id;
    s3.name=s1.name;
    s3.age=s1.age;
    s1.display();  
    s2.display();  
    s3.display();
   }  
}