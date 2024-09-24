class demo1 extends Thread
{
    public void run() 
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++)
        {
            System.out.println(" THREAD    1 ");
        }

    }
}
class demo2 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++)
        {
            System.out.println("THREAD  2");
        }
    }
}
class client
{
    public static void main(String[] args)throws InterruptedException 
    {
        System.out.println(Thread.currentThread().getName());
        demo1 obj1=new demo1();
        demo2 obj2 =new demo2();
        obj1.start();
        Thread.sleep(5000);
        obj2.start();
    }

}