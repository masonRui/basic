package cn.itheima.objects_demo;

import java.util.Arrays;
import java.util.Objects;

public class Demo {

    public static void main(String[] args) {

        int [] arr = new int[10];

        int[] arr1= {1,3, 45,5463,32};

        int[] arr3 = new int[arr1.length];

        for (int i=0; i<10;i++ ){
            arr[i]=i;
        }

        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[arr.length];

        System.arraycopy(arr,0 ,arr2,0,arr.length);

        System.arraycopy(arr1,0,arr3,0,arr1.length);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        Person peter = new Person("Peter", 18);

        Person peter0= null;

        Person peter5 = null;

        Person peter2 =  new Person("Peter",18);

        System.out.println(null==null);

        System.out.println(Objects.equals(peter,peter2 ));

        System.out.println(Objects.equals(peter0,peter2 ));

        System.out.println(Objects.equals(peter0,peter5 ));
    }
}
