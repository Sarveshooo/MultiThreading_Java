///////////////CODE THAT CHANGES THE NAME OF THE THREAD
class demo extends Thread
{
    demo(String str)
    {
        super(str);

    }
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println(getName());
        }
    }
}
class client
{
    public static void main(String[] args) {
        demo obj =new demo("SARVESH");

        obj.start();
    }
}