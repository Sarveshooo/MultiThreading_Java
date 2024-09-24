///////////diff between getName and Thread.currentThread().getNmae())
class demo extends Thread
{
    public void run()
    {
        System.out.println("SEE THE MAIN BLOCK SPOT THE ERRROR");
        System.out.println(Thread.currentThread().getName());
        

        
        
    }

}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();

      //  System.out.println(getName());///////////////////////////error
        System.out.println(Thread.currentThread().getName());
        System.out.println(obj.getName());
        obj.start();
    
    }


}/*get name is not static in nature
while Thread.currentThread().getName()); is ststic threfore it can accesed outside the class  */