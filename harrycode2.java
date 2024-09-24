class mythread1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<40)
        {
            System.out.println("IN THREAD 1 ");
            System.out.println("THREAD 1 IS ENJOYING ");
            i++;
        }
    }
}
class mythread2 extends Thread
{
    @Override
    public void fun()/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\MultiThreading> javac harrycode2.java
    harrycode2.java:17: error: method does not override or implement a method from a supertype
        @Override
        ^
    1 error *//////METHOD NAME MUST BE INCASE WE OVVERRIDE 
    {
        int i=0;
        while(i<40)
        {
        System.out.println("IN THREAD 2");
        System.out.println("THREAD 2 IS ENJOYING  ");
        i++;
        }

    }

}
class client
{
    public static void main(String[] args) {
        mythread1 obj=new mythread1();
        mythread2 obj2=new mythread2();
        obj.start();
        obj2.start();
    }

}