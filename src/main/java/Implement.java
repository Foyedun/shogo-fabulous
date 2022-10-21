public class Implement {
    public static void main(String[] args) {
        MyRunnable runnable =new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
        System.out.println("My Thread is running");

    }
}
