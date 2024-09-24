class demo1 extends Thread
{
    
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<3;i++)
        {
            System.out.println("demo1 thread   1");
        }
    }
}
class demo2 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<3;i++)
        {  
            System.out.println("demo2 thread   2");
        }
    }
}
class client
{
    public static void main(String[] args)throws Exception 
    {
        System.out.println(Thread.currentThread().getName());


        demo1 obj1=new demo1();
        demo2 obj2=new demo2();
        Thread.sleep(5000);
        obj1.start();
        obj2.start();
        obj2.setPriority(Thread.MAX_PRIORITY);
      


    }

}