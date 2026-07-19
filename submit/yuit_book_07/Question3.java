package Java.submit.yuit_book_07;

public class Question3 {
        public static void main(String[] args) {
            try {
                String text = null;
                System.out.println(text.length());
            } catch (NullPointerException e) {
                System.out.println("例外が発生しました");
            }
        }
    }


