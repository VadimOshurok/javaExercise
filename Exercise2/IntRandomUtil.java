package Exercise2;

public class IntRandomUtil {
	public final static void numbers() {
		System.out.print("Перовое число: "+SetNumber.A+"\n");
		System.out.print("Второе число: "+SetNumber.B+"\n");
		System.out.print("Третье число: "+SetNumber.C+"\n");
		System.out.print("\n");
	}
	
	public static void getComparison() {
		int a=SetNumber.A;
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
	
	public static void getSubtraction() {
		int a=SetNumber.A;
		int b=SetNumber.B;
		int c=SetNumber.C;
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
	
	public static void getSumAllNum() {
		int a1=SetNumber.A/100;
		int b1=SetNumber.B/100;
		int c1=SetNumber.C/100;
		int sum=a1+b1+c1;
		System.out.print("2)  Сумма первых цифр в 3х рандомных числах ("+a1+"+"+b1+"+"+c1+"): " +sum+"\n");
		System.out.print("\n");
	}
	
	public static void getSumOneNum() {
		int a=SetNumber.A;
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
		int sum=b+c+d;
		System.out.println("4)  В числе " +a+ " cумма всех цифр: "+sum);
	}
}
