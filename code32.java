/////THIS CODE WHAT HAPPENS WHEN WE USE BOTH THE METHODS TO PRINT THREADS NAME
class demo extends Thread
{
    demo(String str)
    {
        super(str);
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(getName());
    }
}
class client
{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

         demo obj=new demo("SARVESH");

    


        obj.start();

        obj.setName("ABHISH");


       System.out.println(obj.getName());
    }
}