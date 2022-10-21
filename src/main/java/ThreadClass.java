public class ThreadClass {
    public static void main(String[] args) {
       Thread t = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("Thread is executed");
           }});
       t.start();
    }
}
