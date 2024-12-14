// parameterized constructor
class Nconst{
    int a,b;
    Nconst(int x , int y){
      a=x;
      b=y;
    }
    void display(){
        System.out.println("A: "+a+"B: "+b);
    }
    public static void main(String args[]){
        Nconst ob = new Nconst(5,6);
        ob.display();
    }
}
