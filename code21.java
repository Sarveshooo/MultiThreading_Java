    class client
    {
        public static void main(String[] args)throws Exception {
            System.out.println(Thread.currentThread().getName());//1


            Runnable obj1= () ->
            {
              for(int i=0;i<=3;i++)
              {
                 System.out.println("IN THREAD 1");
              }
            try
               {
                 Thread.sleep(1000);
               }
           catch(Exception e)
               {
                 e.printStackTrace();
               }
                System.out.println(Thread.currentThread().getName());
               };

            

            Runnable obj2= () ->
            {
                    for(int i=0;i<=3;i++)
                    {
                        System.out.println("IN THREAD 2");
                    }
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                    System.out.println(Thread.currentThread().getName());
                };

            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);

            t1.start();//3
            System.out.println(t1.isAlive());//2

                                                  Thread.sleep(2000);//5

            t2.start();//7
            System.out.println(t2.isAlive());//6

            t1.join();
            t2.join();


             System.out.println(t1.isAlive());//9
             System.out.println(t2.isAlive());

             System.out.println("END MAIN");//10


        }
        

    }