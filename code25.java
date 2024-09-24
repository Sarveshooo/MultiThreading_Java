class demo extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
class client 
{
    public static void main(String[] args) {
        //demo obj=new demo();
        //obj.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());
        /*main
        Thread[main,5,main] */
      //  System.out.println(obj.getName());
    }
}