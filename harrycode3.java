/*THREAD 1 IS RUNNING 
HELLO FROM THREAD 1             ONLY THIS OUTPUT PRINTS */
class mythread1 extends Thread
{
    public void run()
    {
        int i=0;
        while (i<40)
        {
            System.out.println("THREAD 1 IS RUNNING ");
            System.out.println("HELLO FROM THREAD 1 ");
            i++;
        }
    }

}
class mythread2 extends Thread
{
    
    public void fun()/////////BECAUSE OF CHANGE OF METHOD NAME 
    {
        int i=0;
        while(i<40)
        {
            System.out.println("THREAD 2 IS RUNNING");
            System.out.println("HELLO FROM THREAD 2");
            i++;
        }
    }
}
class client
{
public static void main(String[]args)
{
    mythread1 t1=new mythread1();
    mythread2 t2=new mythread2();
    t1.start();
    t2.start();
}
}