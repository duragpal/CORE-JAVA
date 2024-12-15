class abc extends Thread{
    public void run(){
        //task 1
        for(int j=0;j<5;j++){
            System.out.println("Hi  "+j);
        }
    }
}
class Main{
    public static void main(String args[]){
        abc ob = new abc();
        Thread t = new Thread(ob);
        t.start();
        //task 2
        for(int i=0;i<5;i++){
            System.out.println("Hello "+i);
        }
    }
}
