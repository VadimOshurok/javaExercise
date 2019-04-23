package Exercise2;

public class Main {
	public static void main(String[] args) {
		IntRandomUtil UtilConnector = new IntRandomUtil();
		StringBuilder strBuild = new StringBuilder("");
		
		String result1 = UtilConnector.numbers();
		strBuild.append(result1);
		strBuild.append("\n");
		
		String result2 = UtilConnector.getComparison();
		strBuild.append(result2);
		strBuild.append("\n");
		
		int result3 = UtilConnector.getSumAllNum();
		strBuild.append("2)   Сумма первых цифр в 3х числах = ");
		strBuild.append(result3);
		strBuild.append("\n");
		
		String result4 = UtilConnector.getSubtraction();
		strBuild.append(result4);
		
		int result5 = UtilConnector.getSumOneNum();
		strBuild.append("4)   В числе ");
		strBuild.append(SetNumber.A);
		strBuild.append(" сумма всех цифр = ");
		strBuild.append(result5);
		
		System.out.println(strBuild.toString());
	}
}
