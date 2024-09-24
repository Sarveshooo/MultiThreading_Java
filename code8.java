class inr
{
    int count;
    public void money()
    {
        count++;
    }


}
class client
{
    public static void main(String[] args)throws InterruptedException 
    {
        inr obj3=new inr();
        Runnable obj1= () ->
        {   
                for(int i=0;i<100000;i++)
                {
                    obj3.money();
  
                }
        
            };

        Runnable obj2 = () ->
        {
            for(int i=0;i<100000;i++)
            {
                obj3.money();
             
            }
        };


        Thread t1 =new Thread(obj1);
        Thread t2=new Thread(obj2);

        obj1.run();
        obj2.run();
        System.out.println(obj3.count);
    }
}
