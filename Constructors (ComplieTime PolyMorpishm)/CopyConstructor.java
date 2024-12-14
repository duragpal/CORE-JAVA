//Copy constructor
class Nconst{
    int a,b;
    Nconst(int x , int y){
      a=x;
      b=y;
    }
    Nconst(Nconst x){
        a=x.a;
        b=x.b;
    }
    void display(){
        System.out.println("A: "+a+"B: "+b);
    }
    public static void main(String args[]){
        Nconst ob = new Nconst(5,6);
        Nconst ob2 = new Nconst(ob);
        ob2.display();
    }
}
