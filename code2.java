class demo1 extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("demo1 thread   1");
        }
    }
}
class demo2 extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {  
            System.out.println("demo2 thread   2");
        }
    }
}
class client
{
    public static void main(String[] args) {
        demo1 obj1=new demo1();
        demo2 obj2=new demo2();

        obj1.start();
        obj2.start();

      // System.out.println(obj1.getPriority());////priority starts from 1 to 10
      // System.out.println(obj2.getPriority());////priority starts from 1 to 10
      // obj2.setPriority(10);
       //obj1.setPriority(5);

       obj2.setPriority(Thread.MAX_PRIORITY);
       obj1.setPriority(Thread.NORM_PRIORITY);
       obj1.setPriority(Thread.MIN_PRIORITY);

      


    }

}