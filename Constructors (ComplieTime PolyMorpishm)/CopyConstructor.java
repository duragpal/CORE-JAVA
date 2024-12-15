class CopyCon{
    int a,b;
    CopyCon(int x,int y){
        a=x;
        b=y;
    }
    CopyCon(CopyCon obj){
        a=obj.a;
        b=obj.b;
    }
    void display(){
        System.out.println("a : "+a + " b : "+b);
    }
}
class Main{
    public static void main(String args[]){
        CopyCon ob = new CopyCon(2,3);
        CopyCon ob2 = new CopyCon(ob);
        ob.display();
        ob2.display();
        
    }
}
