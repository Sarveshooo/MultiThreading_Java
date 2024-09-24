class demo extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("THE THREAD IS DEAMON ");
        }
        else
        {
            System.out.println("IT IS A NORMAL THREAD");
        }
    }
}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();
        demo obj2=new demo();
        demo obj3=new demo();

        obj.setDaemon(true);

        obj.start();
        obj2.start();
        obj3.start();

    }
}