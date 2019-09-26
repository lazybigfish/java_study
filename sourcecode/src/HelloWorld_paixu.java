import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloWorld_paixu {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,98,77,34,55,6};
        //先把内容打出来再排序
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        System.out.println("第一次排序");
        //第一步，把第一位和其他位比较
        //如果比其他位置大，就进行交换
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[0]){
                int temp = a[0];
                a[0] = a[i];
                a[i] = temp;
            }
        }
        //这样最小的就在最前面
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        System.out.println("第二次排序");

        //可以发现规律，从而可以套两层
        //第一层为初始对比的位置，和其他的对比完以后再加1
        for (int j = 0; j < a.length; j++) {
            //第二层是对比层，自动加一来排除
            for (int i = j + 1; i < a.length; i++) {
                //如果对比层比初始层小，对比层就调换到初始层的位置
                if (a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        //下面第一行输出是错误的，那是因为System.out.println这个方法，
        // 默认调用的是对象的toString()方法的内容，[表示数组，I表示int类型，b9e45a是对象名。
        //这就是int[] arr对象的toString内容。
        //如果要打印数组，用Arrays这个工具类
        //  System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));


    }
}
