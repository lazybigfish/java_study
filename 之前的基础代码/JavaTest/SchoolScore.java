public class SchoolScore{
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入你的成绩进行等级判定：");
		double score = s.nextDouble();
		int grade = (int)score / 10;
		switch (grade){
			case 9: case 10:
			System.out.println("A");
			break;
			case 8: 
			System.out.println("B");
			break;
			case 7: 
			System.out.println("C");
			break;
			case 6: 
			System.out.println("D");
			break;
			default: 
			System.out.println("E");
		}
	}
}