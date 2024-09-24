//UNPREDICTABLE CODE 
class demo extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<=5;i++)
        {
            System.out.println("IN RUN METHOD");
        }
    }
    public static void main(String[] args) throws InterruptedException
     {
        System.out.println(Thread.currentThread().getName());//1
        demo obj=new demo();//2
        obj.start();//3 CRITICAL 

        for(int i=0;i<=100;i++)
        {
            System.out.println("before sleep");
        }
        Thread.sleep(5000);
        for (int i=0;i<=100;i++)
        {
            System.out.println("IN MAIN");
        }
    }

}