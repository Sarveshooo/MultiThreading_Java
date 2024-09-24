class demo extends Thread 
{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        demo obj=new demo();

        obj.start();

        System.out.println(Thread.currentThread().getName());
        
    }

}