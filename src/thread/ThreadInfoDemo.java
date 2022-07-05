package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();

        String name  = main.getName();
        System.out.println(name);

        long id = main.getId();
        System.out.println(id);

        int priority = main.getPriority();
        System.out.println(priority);

        boolean daemon = main.isDaemon();
        boolean alive = main.isAlive();
        boolean interrupted = main.isInterrupted();
        System.out.println(daemon);
        System.out.println(alive);
        System.out.println(interrupted);
    }
}
