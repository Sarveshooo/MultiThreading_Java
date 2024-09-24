import java.util.concurrent.*;

class Office implements Runnable
{
    String name;
    Office(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(name + "JOB STARTED BY .." + Thread.currentThread().getName());
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {

        }
        System.out.println(name + "JOB COMPLETED BY .." + Thread.currentThread().getName());
    }
}
class demo2
{
    public static void main(String[] args) 
    {
        Office [] jobs ={new Office("SARVESH"),
                        new Office("ASHISH"),
                        new Office("RAHUL"),
                        new Office("SHASHI"),
                        new Office("SACHIN")
    };
    ExecutorService service =Executors.new FixedThreadpool(5);
    for(Office Job :Jobs)

        
    }
}