public class question52 {
    private static void question52(int year) {
        System.out.println("問52");
        boolean check = false;
        // 年号を4で割った余りが0
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            check = true;
        } else {
            check = true;
        }
        System.out.println(check ? "うるう年です。" : "うるう年ではありません。");
    }
}