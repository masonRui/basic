package cn.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysCount {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Please Enter Your Birthday");

        Scanner sc = new Scanner(System.in);

        String birthday = sc.next();

        sc.close();

        Date birth = sdf.parse(birthday);

        Date now = new Date();

        System.out.println("You have lived "+(now.getTime()-birth.getTime())/1000/3600/24+" days");
    }
}
