package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
//            String line = null;
            String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
            System.out.println("!!!!!!!!!!!!!");
//        }catch (NullPointerException e){
//            System.out.println("出现了空指针，这里把他解决了");
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("出现了下标越界，这里把他解决了");
//        }
        }catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现空指针或下标越界后相同的处理方式");
        }catch (Exception e){
            System.out.println("反正就是出了个错");
        }
        System.out.println("程序结束了");
    }
}
