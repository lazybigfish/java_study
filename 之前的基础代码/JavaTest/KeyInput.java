/*接受用户键盘输入
*/

public class KeyInput{
	public static void main(String[] args) {
		//创建键盘扫描对象
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入你的年龄：");

		//调用Scanner对象的next方法
		//程序执行到这里会停下来等待用户输入
		//当用户输入数据以后按下回车，输入的人信息会自动赋值
		//String userInputContent = s.next();
		String str = "无法判断的！";
		int age = s.nextInt();
		if (age > 150 || age < 0) {
			System.out.println("你提供的年龄不合法！");
		}else if (age <= 5) {
			 str = "幼儿";
		}else if (age <= 10) {
			 str = "少年";
		}else if (age <= 18) {
			 str = "青少年";
		}else if (age <= 35) {
			str = "青年";
		}else if (age <= 55) {
			 str = "中年";
		}else{
			 str = "老年";
		}

		System.out.println("你的生命阶段是" +  str);
	}
}