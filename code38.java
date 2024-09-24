class demo
{
    void fun()
    {
        System.out.println("IN FUN METHOD");
    }
    void gun()
    {
        System.out.println("IN RUN METHOD");
    }
}
class demo2
{
    void sun()
    {
        System.out.println("IN SUN METHOD");
    }
}
class demo3 extends demo implements Runnable
{
    public void run()
    {
        demo2 obj=new demo2();
        System.out.println("IN RUNNABLE INTERFACE");
        fun();
        gun();
        obj.sun();
    }
}
class client
{
    public static void main(String[] args) {
        demo3 obj2=new demo3();
        Thread t=new Thread(obj2);
        t.start();
    }
}