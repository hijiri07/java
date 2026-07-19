package Java.submit.yuit_book_07;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
public class Question10 {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("これはカスタム例外です。");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
    }

