class demo extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class client
{
    public static void main(String[] args) {
        demo obj1=new demo();
        demo obj2=new demo();
        demo obj3=new demo();

        obj1.start();//THREAD 0
        obj2.start();///THREAD 1
        obj3.start();///THREAD 2

    }

}