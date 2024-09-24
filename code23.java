class demo extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(getName());
        System.out.println(Thread.currentThread());
    }
}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.start();
    }
}/*Thread-0
Thread-0
Thread[Thread-0,5,main] */

/*Thread[Thread-0,5,main]
 * Thread-0  REPRESENTS THREAD GROUP(CATEGORY)
 * 5 REPRESENTS PROBABLITY OF THREAD 
 * MAIN REPRESENTS GROUP
 */