class demo extends Thread
{
    
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
        demo obj =new demo();
                                                          obj.setName("SARVESH");

        obj.start();
    }
}