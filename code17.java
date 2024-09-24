class demo extends Thread 
{
    public void run()//5
    {
        System.out.println(Thread.currentThread().getName());//6
        for(int i=0;i<=5;i++)//7
        {
            System.out.println("IN RUNNN METHOD");//8
        }
    }
    public static void main(String[] args)throws InterruptedException {
        System.out.println(Thread.currentThread().getName());////1

        demo obj=new demo();//2

        obj.start();//3
        Thread.sleep(5000);///4
        for(int i=0;i<=5;i++)//9
        {
            System.out.println("IN MAIN METHOD");//10
        }
    }
}