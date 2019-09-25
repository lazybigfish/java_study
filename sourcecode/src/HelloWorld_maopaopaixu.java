import java.util.Arrays;

public class HelloWorld_maopaopaixu {
    public static void main(String[] args) {
        int a [] = new int[]{4,33,56,334,86,37,22};
        //排序前先打印
        System.out.println(Arrays.toString(a));

        //第一次排序

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));

        //第二次
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-j-1; i++) {
                if (a[i] >a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    System.out.println(Arrays.toString(a));
                    System.out.println("第"+j+"次");
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
