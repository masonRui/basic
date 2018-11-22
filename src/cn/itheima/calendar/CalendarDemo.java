package cn.itheima.calendar;

import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();

        int year = c1.get(Calendar.YEAR);

        int month = c1.get(Calendar.MONTH);

        int day = c1.get(Calendar.DAY_OF_MONTH);

        int week = c1.get(Calendar.DAY_OF_WEEK);

        System.out.println(getWeek(week));

        c1.set(Calendar.YEAR,1985);

        c1.set(Calendar.MONTH, 9 - 1);

        c1.set(Calendar.DAY_OF_MONTH, 13);

        week = c1.get(Calendar.DAY_OF_WEEK);

        System.out.println(getWeek(week));

        Calendar c2 = Calendar.getInstance();

        c2.add(Calendar.DAY_OF_YEAR,7);

        System.out.println(c2.get(Calendar.YEAR) + "年" + (c2.get(Calendar.MONTH) + 1) + "月" + c2.get(Calendar.DAY_OF_MONTH) + "日");

        Calendar c3 = Calendar.getInstance();

        c3.set(Calendar.YEAR, 2017);

        System.out.println(getWeek(c3.get(Calendar.DAY_OF_WEEK)));
    }

    public static String getWeek(int i){
        String[] weekArray = {"Sun","Mon","Tue","Wed","Thurs","Fri","Sat"};

        return weekArray[i-1];
    }
}
