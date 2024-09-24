class demo{
    static
    {
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        System.out.println(10/0);
    }
}
/*Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArithmeticException: / by zero
        at demo.<clinit>(code27.java:4) */