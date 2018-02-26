import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        //date.setTime(1512487232323L);
        System.out.println(date);

        DateFormat df1;
        DateFormat df2;
        //df1=DateFormat.getDateInstance();
        //df2=DateFormat.getDateTimeInstance();
        //System.out.println("Date"+df1.format(date));
        //System.out.println("DateTime"+df2.format(date));

        df1 = DateFormat.getDateInstance(DateFormat.FULL, new Locale("zh", "CN"));
        df2 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, new Locale("zh", "CN"));
        System.out.println("Date" + df1.format(date));
        System.out.println("Date" + df2.format(date));
        //SimpleDateFormat();

        String strDate = "2010-01-01 00:00:00.000";
        Date d = null;
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH-mm-ss.SSS");
        try {
            d = sdf1.parse(strDate);
        } catch (Exception ignored) {
        }
        System.out.println(d);
        String str = sdf2.format(d);
        System.out.println(str);
    }
}
