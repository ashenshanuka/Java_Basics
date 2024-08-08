public class Employee {
    String name;
    int age;
    double salary;
    String location;
    Employee(String name,String location,int age,double salary){
        this.name= name;
        this.location=location;
        this.age= age;
        this.salary= salary;
        
    }
    
    void raise(){
        this.salary= this.salary+1000;
    }
}


