import java.util.Scanner;
public class HelloWorld_switch {
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        switch (a){
            case 1:
                System.out.println("礼拜一");
                break;
            case 2:
                System.out.println("礼拜二");
                break;
            default:
                System.out.println("写你妈呢？");
        }

    }
}
