interface One{
    public void printHi1();
        
}
interface Two{
    public void printHi2();
}
class Demo implements One,Two{
   @Override public void printHi1(){
        System.out.println("Hi from Method 1");
    }
    @Override public void printHi2(){
        System.out.println("Hi from Method 2.");
    }
    
}
//Driver class
class Main{
    public static void main(String args[]){
        Demo ob = new Demo();
        ob.printHi1();
        ob.printHi2();
        
    }
}