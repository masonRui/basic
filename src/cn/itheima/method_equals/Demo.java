package cn.itheima.method_equals;

public class Demo {

    public static void main(String[] args) {

        Person p1 = new Person("张三",21 );

        Person p2 = new Person("张三",21);

        System.out.println(p1.equals(p2));

         String s1 = "hehe";

         String s2= "he"+"he";

         String s3 ="he";

         String s4 ="he"+s3;

         String s5=s3+"he";
        System.out.println(s1==(s2));
        System.out.println(s4==(s1));
        System.out.println(s1==(s5));
        System.out.println(s1.equals(s5));

    }





}
