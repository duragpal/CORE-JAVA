class Calculation {
    int z;
    public void addition(int x, int y){
        z=x+y;
        System.out.println("Sum : "+z);
    }
    public void subtraction(int x, int y){
        z=x-y;
        System.out.println("Difference : "+z);
    }
}
public class Main extends Calculation {
    public static void main(String args[]){
        Main ob = new Main();
        int a=20,b=10;
        ob.addition(20,10);
    }
}