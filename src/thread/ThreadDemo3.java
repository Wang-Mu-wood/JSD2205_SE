package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(222);
                }
            }
        };



        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(111);
            }
        });

        t1.start();
        t2.start();
    }
}
