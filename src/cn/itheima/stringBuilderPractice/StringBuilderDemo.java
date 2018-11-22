package cn.itheima.stringBuilderPractice;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String str = "a";
        long start = System.currentTimeMillis();
        for (int i=0;i<1000;i++) {
            str = str + "a";
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        StringBuilder sb = new StringBuilder("b");
        long start1 = System.currentTimeMillis();
        for (int i=0;i<1000;i++) {
            sb.append("b");
        }
        System.out.println(sb);
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);
    }
}
