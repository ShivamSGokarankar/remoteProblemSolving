import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class Hckrfive {

    public static void main(String[] args) {
        double payment = 10000;
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment));

    }
}
