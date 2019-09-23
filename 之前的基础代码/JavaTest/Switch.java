/*
语法结构
switch(int或者 String 类型的字面值或者变量){
	case int或者 String 类型的字面值或者变量：
	Java语句；
	break;
	case int或者 String 类型的字面值或者变量：
	Java语句；
	break;
	case int或者 String 类型的字面值或者变量：
	Java语句；
	break;
	case int或者 String 类型的字面值或者变量：
	Java语句；
	break;
	default;
	java;
}
switch括号内的数据与case后的人数据进行比较匹配，匹配成功变执行次Java语句；
若是没有一条匹配成功，那么执行default语句；
switch和case后面只能纸int或者string类型
*/

public class Switch{
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Welcome Useing Simple Comple!");
		System.out.print("请输入第一个数字：");
		int num1 = s.nextInt();

		System.out.print("请输入运算符：");
		String operator = s.next();

		System.out.print("请输入第二个数字：");
		int num2 = s.nextInt();

		int result = 0;

		switch(operator){
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
		}

		System.out.println("运算结果为：" + num1 + operator + num2 + "=" + result);


		}
		
	}
