package Exercise2;

public class IntRandomUtil {
	public final static String numbers() {
		StringBuilder strBuild = new StringBuilder("Первое число: ");
		strBuild.append(SetNumber.A);
		strBuild.append("\n");
		strBuild.append("Второе число: ");
		strBuild.append(SetNumber.B);
		strBuild.append("\n");
		strBuild.append("Третье число: ");
		strBuild.append(SetNumber.C);
		strBuild.append("\n");
		return strBuild.toString();
	}
	
	public static String getComparison() {
		StringBuilder strBuild = new StringBuilder("");
		int a=SetNumber.A;
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
		if(b>c&b>d) {
			strBuild.append("1)   В числе ");
			strBuild.append(a);
			strBuild.append(" наибольшая цифра ");
			strBuild.append(b);
		}
		else {
			if(c>b&c>d) {
				strBuild.append("1)   В числе ");
				strBuild.append(a);
				strBuild.append(" наибольшая цифра ");
				strBuild.append(c);
			}
			else {
				strBuild.append("1)   В числе ");
				strBuild.append(a);
				strBuild.append(" наибольшая цифра ");
				strBuild.append(d);
			}
		}
		return strBuild.toString();
	}
	
	public static String getSubtraction() {
		StringBuilder strBuild = new StringBuilder("");
		int a=SetNumber.A;
		int b=SetNumber.B;
		int c=SetNumber.C;
		if(a>=b) {
			int sub=a-b;
			strBuild.append("3)   Разница между 1-ым и 2-ым числом = ");
			strBuild.append(sub);
			strBuild.append("\n");
		}
		else {
			int sub=b-a;
			strBuild.append("3)   Разница между 1-ым и 2-ым числом = ");
			strBuild.append(sub);
			strBuild.append("\n");
		}
		if (b>=c) {
			int sub=b-c;
			strBuild.append("     Разница между 2-ым и 3-им числом = ");
			strBuild.append(sub);
			strBuild.append("\n");
		}
		else {
			int sub=c-b;
			strBuild.append("     Разница между 2-ым и 3-им числом = ");
			strBuild.append(sub);
			strBuild.append("\n");
		}
		if (a>=c) {
			int sub=a-c;
			strBuild.append("     Разница между 3-им и 1-ым числом = ");
			strBuild.append(sub);
			strBuild.append("\n");
		}
		else {
			int sub=c-a;
			strBuild.append("     Разница между 3-им и 1-ым числом = ");
			strBuild.append(sub);
			strBuild.append("\n");
		}
		return strBuild.toString();
	}
	
	public static int getSumAllNum() {
		int a1=SetNumber.A/100;
		int b1=SetNumber.B/100;
		int c1=SetNumber.C/100;
		int sum=a1+b1+c1;
		return sum;
	}
	
	public static int getSumOneNum() {
		int a=SetNumber.A;
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
		int sum=b+c+d;
		return sum;
	}
}
