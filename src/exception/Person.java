package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age<0||age>100){
//            throw new RuntimeException("年龄超过了范围！");
//            throw new Exception("年龄超过了范围");
            throw new IllegalAgeException("年龄超过了范围");
        }
        this.age = age;
    }
}
