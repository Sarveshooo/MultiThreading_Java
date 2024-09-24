/*THIS IS THE CODE WITH RUNNABLE INTERFACE AND ANNONYMOUS INNER CLASS USING LAMBDA FUNCTION INCLUDING SLEEP METHOD AND AND IS ALIVE   */
class client
{
    public static void main(String args[]) throws InterruptedException
    {
        Runnable obj1= () -> 
    {
        for(int i=0;i<5;i++)
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


    };
        Runnable obj2= () ->
        {
            
                for(int i=0;i<5;i++)
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
        };
        Thread t1=new Thread(obj1);
        Thread t3=new Thread(obj2);

        t1.start();
        t3.start();

       System.out.println(t1.isAlive());
       System.out.println(t3.isAlive());

       
         t1.join();////check the diffrence by commenting the the join method 
         t3.join();



        System.out.println("bye");////MAIN THREAD 
        System.out.println(t1.isAlive());
        System.out.println(t3.isAlive());
       
    }
    
}
