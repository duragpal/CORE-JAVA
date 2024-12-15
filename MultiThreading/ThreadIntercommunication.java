class Customer{
    int amt = 10000;
    synchronized void withdraw(int amt){
        System.out.println("Going to withdraw..");
        if(this.amt<amt){
            System.out.println("Less balance ...waiting for deposit");
            try{
                wait();
            }catch(Exception e){}
        }
        this.amt-=amt;
        System.out.println("Withdraw completed....");
    }
    synchronized void deposit(int amt){
        System.out.println("Going to Deposit..");
       
        this.amt+=amt;
        System.out.println("Deposit completed....");
        notify();
    }
    
}
class Main{
    public static void main(String args[]){
        final Customer  c = new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
        
    }
}
