package Exercise2;

public class Program {
	
	public static String getComparison() {
		StringBuilder strBuild = new StringBuilder();
		int a=SetNumber.getRandom();
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
		strBuild.append("1)   В числе ");
		strBuild.append(a);
		strBuild.append(" наибольшая цифра ");
		if(b>c&b>d) {
			strBuild.append(b);
		}
		else {
			if(c>b&c>d) {
				strBuild.append(c);
			}
			else {
				strBuild.append(d);
			}
		}
		return strBuild.toString();
	}
	
	public static String getSubtraction() {
		StringBuilder strBuild = new StringBuilder();
		int sub=0;
		int a=SetNumber.getRandom();
		int b=SetNumber.getRandom();
		int c=SetNumber.getRandom();
		if(a>=b) {
			sub=a-b;
			strBuild.append("3)   Разница между ");
			
		}
		else {
			sub=b-a;
			strBuild.append("3)   Разница между ");
		}
		strBuild.append(a);
		strBuild.append(" и ");
		strBuild.append(b);
		strBuild.append(" = ");
		strBuild.append(sub);
		strBuild.append("\n");
		if (b>=c) {
			sub=b-c;
			strBuild.append("     Разница между ");
		}
		else {
			sub=c-b;
			strBuild.append("     Разница между ");
		}
		strBuild.append(b);
		strBuild.append(" и ");
		strBuild.append(c);
		strBuild.append(" = ");
		strBuild.append(sub);
		strBuild.append("\n");
		if (a>=c) {
			sub=a-c;
			strBuild.append("     Разница между ");
		}
		else {
			sub=c-a;
			strBuild.append("     Разница между ");
		}
		strBuild.append(c);
		strBuild.append(" и ");
		strBuild.append(a);
		strBuild.append(" = ");
		strBuild.append(sub);
		strBuild.append("\n");
		return strBuild.toString();
	}
	
	public static String getSumAllNum() {
		StringBuilder strBuild = new StringBuilder();
		int a=SetNumber.getRandom();
		int a1=a/100;
		int b=SetNumber.getRandom();
		int b1=b/100;
		int c=SetNumber.getRandom();
		int c1=c/100;
		int sum=a1+b1+c1;
		strBuild.append("2)   Сумма первых цифр в 3х рандомных числах числах ");
		strBuild.append(a);
		strBuild.append(", ");
		strBuild.append(b);
		strBuild.append(", ");
		strBuild.append(c);
		strBuild.append(" = ");
		strBuild.append(sum);
		return strBuild.toString();
	}
	
	public static String getSumOneNum() {
		StringBuilder strBuild = new StringBuilder();
		int a=SetNumber.getRandom();
		int b=a%10;
		int c=(a/10)%10;
		int d=(a/100)%10;
		int sum=b+c+d;
		strBuild.append("4)   Сумма всех цифр в числе ");
		strBuild.append(a);
		strBuild.append(" = ");
		strBuild.append(sum);
		return strBuild.toString();
	}
}
