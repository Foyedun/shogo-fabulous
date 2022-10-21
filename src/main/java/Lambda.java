public class Lambda {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Fabulous is running");
        });
        t.start();
    }
    }
