import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    MyTread myTread = new MyTread();
    myTread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myTread.shutdown();

    }
}

class MyTread extends Thread {
    private volatile boolean running = true;


    @Override
    public void run() {
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutdown() {
        this.running = false;
    }
}
