class Vehicle{
    void run(){
        System.out.println("Vehicle Running..");
    }
}
class Bike extends Vehicle{
    @Override void run(){
        System.out.println("Bike Running Safely.");
    }
}
class Main{
    public static void main(String args[]){
        Bike ob  = new Bike();
        ob.run();
    }
}