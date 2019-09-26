# Java基础！

## 数组

int[] a; 声明了一个数组变量。
[]表示该变量是一个数组
int 表示数组里的每一个元素都是一个整数
a 是变量名
但是，仅仅是这一句**声明，不会创建数组**

有时候也会写成int a[]; 没有任何区别，就是你看哪种顺眼的问题

```java
public class HelloWorld {
	public static void main(String[] args) {
		// 声明一个数组
		int[] a;
	}
}

```

创建数组时候指定数组长度