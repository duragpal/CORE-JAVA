interface One{
    public void printHi1();
        
}
class Two{
    public void printHi2(){
        System.out.println("Hi from method 2");
    }
}
class Demo extends Two implements One{
   @Override public void printHi1(){
        System.out.println("Hi from Method 1");
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