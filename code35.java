class demo extends Thread
{
    demo(String str)
    {
        super(str);
    }
    public void run()
    {

    System.out.println(Thread.currentThread().getName());    
    for(int i=0;i<5;i++)
    {
        System.out.println("THE 1ST THREAD ");
    }
    try
    {
        Thread.sleep(1000);
    }
    catch(Exception e)
    {

    }

}
}
class demo1 extends Thread
{ 
    demo1(String str)
    {
        super(str);
    }
    public void run()
    {
       System.out.println(getName());
    for(int i=0;i<5;i++)
    {
        System.out.println("THE 2ND THREAD ");
    }
    try
    {
        Thread.sleep(1000);
    }
    catch(Exception e)
    {

    
}
}}
class client
{
    public static void main(String[] args) throws InterruptedException
     {
        demo obj =new demo("THIS IS THE 1ST THREAD");
        demo1 obj2 =new demo1("THIS IS THE SECOND THREAD");

        obj.start();
        obj2.start();

      obj.join();
      obj2.join();
      // COMMENT THE JOIN AND SEE THE MAGIC OF JOIN
    


        Thread.currentThread().setName("THE MAIN THREAD");
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<5;i++)
        {
            System.out.println("THIS IS THE MAIN THREAD");
        
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }
    }

      
    }


}
