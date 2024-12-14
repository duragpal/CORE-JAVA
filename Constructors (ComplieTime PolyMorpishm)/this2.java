class Person{
    String name;
    int age;
    Person(String name){
        this(name,5);
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void PrintName(){
        
      
        System.out.println("Name,age "+ this.name + ", "+this.age);
    }
    public static void main(String args[]){
        Person person =new Person("John");
        Person person2 = new Person("Jenny");
        person.PrintName();
        person2.PrintName();
    }
}
