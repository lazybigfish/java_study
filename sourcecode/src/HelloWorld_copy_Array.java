import java.util.Arrays;

public class HelloWorld_copy_Array {
    public static void main(String[] args) {
        int a [] = new int[] {22,45,33,56,44,67,53};
        int b [] = new int[4];
        //第一种复制是遍历

        /*for (int i = 0; i <b.length ; i++) {
            b[i] = a[i];

        }*/

        //第二种是复制方法
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.arraycopy(a,0,b,0,4);

        //第三种是数组的复制方法
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)

        int[] c =Arrays.copyOfRange(a,0,4);

        System.out.println(Arrays.toString(b));
    }
}
