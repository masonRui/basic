package cn.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        long time = date.getTime();

        System.out.println(time);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = sdf.parse("1999-12-12");

        String time2 = sdf.format(date);

        System.out.println(time2);
        System.out.println(date1.getTime());

        Date date3 = new Date(944928000000l);

        String time3 = sdf.format(date3);

        System.out.println(time3);

        Date date4 = new Date(99, 12-1, 12);

        String time4 = sdf.format(date4);

        System.out.println(date4);
        System.out.println(time4);
    }
}
