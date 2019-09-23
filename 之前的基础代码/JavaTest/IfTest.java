/**
	if的四种语法结构：
	1.
	if(布尔表达式){
		java 语句；
	}
	2.
	if(布尔表达式){
		布尔表达式为真执行java 语句；
	}else{
		布尔表达式为假执行java 语句；
	}
	3.
	if(boolean){
	true
	}else if{
	true
	}else if{
	true
	}else if{
	
	}
	4.3.
	if(boolean){
	true
	}else if{
	true
	}else if{
	true
	}else {
	
	}
	*对于if语句而言，只要有一个执行就立即结束；
	*所有的控制语句都可以嵌套
*/

public class IfTest{
	public static void main(String[] args) {
		 double diatance = 6.0;
		 if (diatance < 5) {
		 	System.out.println("去KFC吃开封菜！");
		 }else {
		 	System.out.println("在家吃馍馍！");
		 }

		 String grade = "该学生成绩不及格！";
		 int score = -44;
		 if (score < 0 || score > 100) {
		 	grade = "该学生成绩统计错误！";
		 }else if (score >= 90) {
		 	grade = "该学生成绩为A！";
		 }else if (score >= 80) {
		 	grade = "该学生成绩为B！";
		 }else if (score >= 70) {
		 	grade = "该学生成绩为C！";
		 }else if (score >= 60) {
		 	grade = "该学生成绩为D！";
		 }
		 	System.out.println(grade);
		 
		 String out = "";
		 int ages = 33;
		 if (ages > 150 || ages < 0) {
		 	out = "输入的年龄有误！";
		 }else if (ages >= 56) {
		 	out = "老年人！";
		 }else if (ages >= 55) {
		 	out = "";
		 }else if (ages >= 55) {
		 	out = "";
		 }
	}
}