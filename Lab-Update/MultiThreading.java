class Threads extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            Threads obj = new Threads();
            obj.start();
        }
    }
}
