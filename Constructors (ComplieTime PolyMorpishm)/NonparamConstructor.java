// Non parameterized constructor
class Nconst{
    int a,b;
    Nconst(){
        a=2;b=5;
    }
    void display(){
        System.out.println("A: "+a+"B: "+b);
    }
    public static void main(String args[]){
        Nconst ob = new Nconst();
        ob.display();
    }
}
