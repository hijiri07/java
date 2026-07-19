package Java.submit.yuit_book_07;

public class Question9 {
    public static void main(String[] args) {
        try {
            String text =null;
            System.out.println(text.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("配列の範囲外です");
        }
        catch (NullPointerException e) {
            System.out.println("オブジェクトがnullです");
        }
    }
}
