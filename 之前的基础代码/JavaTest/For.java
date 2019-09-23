/*语法结构
for(初始化表达式；布尔表达式；更新表达式){
	需要重复执行的代码片段（循环体，有Java语句构成）
}
*/
public class For{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			for (int j =1 ;j <=i ;j++ ) {
				System.out.print(i + "*" + j + "="+  i * j +" " );
			}
			System.out.println();
		}
			
	}
}