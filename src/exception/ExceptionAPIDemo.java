package exception;

public class ExceptionAPIDemo {
    public static void main(String[] args) {
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();

            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
