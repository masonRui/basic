package cn.itheima.systemPractice;

public class systemDemo {
    public static void main(String[] args) {
        int[] arr= new int[100000000];
        long start = System.currentTimeMillis();
        for (int i=0; i<arr.length; i++){
            arr[i]=i;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行时间"+(end-start)+"毫秒");
    }
}
