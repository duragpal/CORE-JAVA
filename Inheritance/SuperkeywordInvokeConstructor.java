// Invoke a superclass constructor
class Superclass {
    int age;
    Superclass(int age){
        this.age=age;
    };
    public void getAge(){
        System.out.println(" Super Age : "+age);
    }
}
class Base extends Superclass{
    Base(int age){
        super(age);
    }
    
}
class Main {
    public static void main(String args[]){
        Base ob = new Base(24);
        ob.getAge();
    }
}