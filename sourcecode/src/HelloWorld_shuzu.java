public class HelloWorld_shuzu {
    public static void main(String[] args) {
        int [] a = new int[5]; //分配了长度是5的空间，但是没有赋值
        //没有赋值那就会是默认值，0
        //两种赋值
        int[] b = new int[]{100,200,300};
        //省略new int 等同效果
        int[] c = {300,200,400};
        a[0] = (int)(Math.random() * 100);
        a[1] = (int)(Math.random() * 100);
        a[2] = (int)(Math.random() * 100);
        a[3] = (int)(Math.random() * 100);
        a[4] = (int)(Math.random() * 100);

        System.out.println("随机数：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
