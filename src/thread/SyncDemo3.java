package thread;

public class SyncDemo3 {
    public static void main(String[] args) {
        Boo b1 = new Boo();
        Boo b2 = new Boo();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1.dosome();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo {
    //    public static synchronized void dosome(){
    public static void dosome() {

        synchronized (Boo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + "：正在执行dosome方法...");
                Thread.sleep(5000);
                System.out.println(t.getName() + "：执行方法完毕！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}