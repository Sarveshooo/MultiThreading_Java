//TODO: THREAD USING RUNNABLE INTERFACE 
class demo implements Runnable
{
    public void run()
    {
        System.out.println("IN RUN METHOD");
        System.out.println(Thread.currentThread().getName());
    }
}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();
        Thread t1 =new Thread(obj,"SARVESH");//TODO: CHANGED THE NAME OF CHILD THREAD WITHOUT IMPLEMENTING SETNAME AND CONSTRUCTOR
    
        t1.start();

        Thread.currentThread().setName("THE MAIN MANUS");//TODO:CHANGED THE NAME OF MAIN THREAD 
        System.out.println(Thread.currentThread().getName());
    }

}