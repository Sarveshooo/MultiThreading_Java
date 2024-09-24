class demo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(getName());
}
}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();
        System.out.println(Thread.currentThread().getName());
        System.out.println(getName);
        obj.start();
    }


}