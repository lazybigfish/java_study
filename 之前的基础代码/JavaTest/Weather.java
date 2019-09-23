public class Weather{
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用本系统，本系统可以根据你提供的信息为你的出行提供些许建议。");
		System.out.println("当前天气为晴天还是雨天：天晴为1，雨天为2");
		String str = "正确输入天气！";
		int weather = s.nextInt();
		 if (weather == 1) {
			java.util.Scanner w = new java.util.Scanner(System.in);
			System.out.println("当前温度为多少：");
			int temperature = w.nextInt();
			if (temperature > 30) {
				java.util.Scanner n = new java.util.Scanner(System.in);
			System.out.println("请输入你的性别：男为1，女为2");
			int sex = n.nextInt();
			if (sex == 1) {
				System.out.println("请带墨镜");
			}else if(sex == 2) {
				System.out.println("请摸防晒霜");
			}else {
				System.out.println("请重新启动并输入正确性别！");
			}
			}else {
				System.out.println("你可以安心出门！");
			}

		}else if(weather == 2) {
			java.util.Scanner d = new java.util.Scanner(System.in);
			System.out.println("请输入你的性别：男为1，女为2");
			int sex = d.nextInt();
			if (sex == 1) {
				System.out.println("请带上一把大黑伞");
			}else if(sex == 2) {
				System.out.println("请带上一把小花伞");
			}else {
				System.out.println("请重新启动并输入正确性别！");
			}

		}else{
			System.out.println("请重新启动并输入" + str);
		}
	}
}