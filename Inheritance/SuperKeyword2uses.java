//USES: 1) differentiate b/w super and base class instance variables with same name
// 2) To invoke the superclass method when methods name is same


class Super {
    int num=20;
    public void display(){
        System.out.println("Display from Super class.");
    }
}
class Base extends Super{
    int num=10;
    public void display(){
        System.out.println("Display from base class.");
    }
    public void baseMethod(){
        Base ob = new Base();
        ob.display();
        super.display();
        System.out.println("Super Num: "+super.num);
        System.out.println("Base Num: "+ob.num);
    }
    
} //cant use super directly , create another method for it
//Driver class
class Main{
public static void main(String args[]){
        Base ob = new Base();
        ob.baseMethod();
    }
}