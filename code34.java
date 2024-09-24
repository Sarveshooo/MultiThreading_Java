class demo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("in runnn");
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
class client
{
    public static void main(String[] args)throws Exception {
        demo obj =new demo();
        obj.start();

        

        for(int i=0;i<10;i++)
        {
           
            System.out.println("IN MAIN");
                Thread.sleep(1000);  
        }
    }

}