import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("今日は何月何日でしょう？");
        String input = "";
        System.out.print("何月？==> ");
        int inputMonth = Integer.parseInt(in.readLine());
        System.out.print("何日？==> ");
        int inputDay = Integer.parseInt(in.readLine());
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        if(inputMonth == month && inputDay == day){
            System.out.println("正解！！");
        } else {
            System.out.println("間違っています。");
        }
    }
}