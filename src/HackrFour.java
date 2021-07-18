import java.util.Calendar;
import java.util.Date;

public class HackrFour {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2021 ,3,29);
        int p = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        System.out.println(days[p-1]);
    }
}