abstract class A {} //abstract class
abstract void run(); //abstract method no body

//Abstract Classwith Abstract method.
abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("Running safely.");
    }
}

class Main{
    public static void main(String args[]){
        Bike ob = new Honda();
        ob.run();
    }
}