/*1 code of c2w  */
class demo extends Thread
{
    public static void main(String[]args) throws InterruptedException
    {
        demo obj=new demo();

        obj.start();
        obj.start();
    }
}////////////////////EXCEPTION 