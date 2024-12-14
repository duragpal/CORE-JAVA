class One{
    public void printHi1(){
        System.out.println("Hi there from 1.");
    }
}
class Two extends One{
    public void printHi2(){
        System.out.println("Hi there from 2.");
    }
}
class Three extends One{
    public void printHi3(){
        System.out.println("Hi there from 3.");
    }
}
//Driver class
class Main{
    public static void main(String args[]){
        Two ob2 = new Two();
        ob2.printHi1();
        ob2.printHi2();
        Three ob3 = new Three();
        ob3.printHi1();
        ob3.printHi3();
        
    }
}