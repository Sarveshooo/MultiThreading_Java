//////RUNNABLE INTERFACE 
class demo1 implements Runnable
{
    public void run() 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(" THREAD    1 ");
        }

    }
}
class demo2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("THREAD  2  ");
        }
    }
}
class client
{
    public static void main(String[] args)throws InterruptedException {
        Runnable obj1=new demo1();
        Runnable obj2 =new demo2();

        Thread t1 =new Thread(obj1);
        Thread t2=new Thread(obj2);

        obj1.run();
        obj2.run();


        





        
    }

}