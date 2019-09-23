/*
	
*/
public class Operator{
	public static void main(String[] args) {
		boolean sex = false;
		char c = sex ? '男' :'女';
		System.out.println(c);

		sex = true;
		c = (sex ? '男':'女');
		System.out.println(c);

		System.out.println(sex?'男':'女');
	}
}