/////////LANBDA FUNCTION WORKS ON ONLY RUNNABLE INTERFACE NOT BASIC CLASS 
class demo1 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("THE THREAD DEMO 1");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);

            }
        }

    }
}
class demo2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("THE THREAD DEMO 2");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);

            }
        }
    }

}
class client
{
    public static void main(String args[]) throws Exception
    {
        demo1 obj= () ->//////////LANBDA FUNCTION WORKS ON ONLY RUNNABLE INTERFACE NOT BASIC CLASS 
        {
      
                    for(int i=0;i<10;i++)
                    {
                        System.out.println("THE THREAD DEMO 1");
                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException ie)
                        {
                            System.out.println(ie);
                        }
                    }
                };
        demo2 obj1=new demo2();
        obj.start();
        obj1.start();
    }

}