package Java.submit.yuit_book_07;

public class Question6 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("結果: " + result);
        } catch (ArithmeticException e) {

            System.out.println("エラーが発生しました: ");
        } finally {
            System.out.println("プログラム終了");
        }
    }
}

