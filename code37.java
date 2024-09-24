//TODO: WHY TO USE THREAD USING RUNNABLE INTERFACE BECAUSE JAVA CLASS DOES NOT SUPPORT MULTIPLE INHERITANCE BUT JAVA INTERFACE SUPPORTS 
class demo
{
    void fun()
    {
        System.out.println("IN FUN METHOD");
    }
    void gun()
    {
        System.out.println("IN GUN METHOD");
    }
}
class demo2 extends Thread
{
    public void run()
    {
        System.out.println("IN RUN METHOD");
    }
}
class demo3 extends demo implements Runnable
{
    public void run()
    {
        System.out.println("IN RUNNABLE INTERFACE");
    }
}
class client
{
    public static void main(String[] args) {
        demo obj5=new demo();
        obj5.fun();
        obj5.gun();

        demo3 obj=new demo3();
        Thread t1 =new Thread(obj);
        t1.start();

        demo2 obj2=new demo2();
        obj2.start();
    }

}