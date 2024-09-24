class demo1 extends Thread
{
    public void run() 
    {
        for(int i=0;i<20;i++)
        {
            System.out.println(" THREAD    1 ");
        }
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
class demo2 extends Thread
{
    public void run() 
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("THREAD  2  ");
        }
           
        }
    }

class client
{
    public static void main(String[] args)throws InterruptedException {
        demo1 obj1=new demo1();
        demo2 obj2 =new demo2();
        obj1.start();
        obj2.start();
    }

}