package Exercise2;

import java.util.Random;

public class Program2 {
	static Random rnd=new Random();
	static int a=getRandom();
	static int b=getRandom();
	static int c=getRandom();
	
	public static void main(String[] args) {
		numbers();
		getComparison();
		getSumAllNum();
		getSubtraction();
		getSumOneNum();
	}
	
	private static void numbers() {
		System.out.print("Перовое число: "+a+"\n");
		System.out.print("Второе число: "+b+"\n");
		System.out.print("Третье число: "+c+"\n");
		System.out.print("\n");
	}
	
	public static int getRandom() {
		int random=(int)rnd.nextInt(899)+100;
		return random;
	}
	
	public static void getComparison() {
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
		if(b>c&b>d) {
			System.out.println("1)  В числе " +a+" наибольшая цифра "+b);
		}
		else {
			if(c>b&c>d) {
				System.out.println("1)  В числе "+a+" наибольшая цифра "+c);
			}
			else {
				System.out.println("1)  В числе "+a+" наибольшая цифра "+d);
			}
		}
		System.out.print("\n");
	}
	
	public static void getSumAllNum() {
		int a1=a/100;
		int b1=b/100;
		int c1=c/100;
		int sum=a1+b1+c1;
		System.out.print("2)  Сумма первых цифр в 3х рандомных числах: "+sum+"\n");
		System.out.print("\n");
	}
	
	public static void getSubtraction() {
		if(a>=b) {
			int sub=a-b;
			System.out.println("3)  Разница между 1-ым и 2-ым числом: "+sub);
		}
		else {
			int sub=b-a;
			System.out.println("3)  Разница между 1-ым и 2-ым числом: "+sub);
		}
		if (b>=c) {
			int sub=b-c;
			System.out.println("Разница между 2-ым и 3-им числом: "+sub);
		}
		else {
			int sub=c-b;
			System.out.println("Разница между 2-ым и 3-им числом: "+sub);
		}
		if (a>=c) {
			int sub=a-c;
			System.out.println("Разница между 3-им и 1-ым числом: "+sub);
		}
		else {
			int sub=c-a;
			System.out.println("Разница между 3-им и 1-ым числом: "+sub);
		}
		System.out.print("\n");
	}
	
	public static void getSumOneNum() {
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
		int sum=b+c+d;
		System.out.println("4)  В числе " +a+ " cумма всех цифр: "+sum);
	}
}
