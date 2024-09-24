/////////using Runnable interface with lambda function
class client
{
    public static void main(String[] args)throws InterruptedException {
        Runnable obj1= () ->
        {   
                for(int i=0;i<5;i++)
                {
                    System.out.println(" THREAD    1 ");
                }
        
            };

        Runnable obj2 = () ->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("THREAD  2  ");
            }
        };


        Thread t1 =new Thread(obj1);
        Thread t2=new Thread(obj2);

        obj1.run();
        obj2.run();
    }
}
