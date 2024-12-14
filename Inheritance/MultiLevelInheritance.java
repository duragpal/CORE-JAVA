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
class Three extends Two{
    public void printHi3(){
        System.out.println("Hi there from 3.");
    }
}
//Driver class
class Main{
    public static void main(String args[]){
        Three ob = new Three();
        ob.printHi1();
        ob.printHi2();
        ob.printHi3();
    }
}