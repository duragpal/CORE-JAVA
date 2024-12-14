//save by A.java
package pack;
class A{
void msg(){System.out.println("Hello");}
}

//save by B.java
package mypack;
import pack.*;
class B{
public static void main(String args[]){
A obj = new A();//Compile Time Error
obj.msg();//Compile Time Error
}
}