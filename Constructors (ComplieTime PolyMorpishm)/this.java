class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    void PrintName(){
        String name  = "Hello";
        System.out.println("Name:"+name);
        System.out.println("Name: "+ this.name);
    }
    public static void main(String args[]){
        Person person =new Person("John");
        Person person2 = new Person("Jenny");
        person.PrintName();
        person2.PrintName();
    }
}
