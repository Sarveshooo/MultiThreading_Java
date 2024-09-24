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
    public static void main(String[] args)throws Exception {
        demo obj=new demo();//1
        obj.start();//2
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<=100;i++)
        {

            System.out.println("BEFORE SLEEP");
        }
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<=100;i++)
        {
            System.out.println("AFTER SLEEP");
        }
        System.out.println(obj.isAlive());
        
    }
}