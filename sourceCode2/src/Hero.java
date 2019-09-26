public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public static void main(String[] args) {
        //创建一个对象
        new Hero();
        //使用一个h来指向上面的对象，上面那句可以将忽略
        Hero h = new Hero();
    }
}
