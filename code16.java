class demo extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        demo obj=new demo();

        System.out.println(Thread.currentThread().getName());

        obj.start();

        System.out.println(Thread.currentThread().getName());
    }



}