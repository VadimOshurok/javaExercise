package Exercise2;

public class Main {
	public static void main(String[] args) {
		Program UtilConnector = new Program();
		StringBuilder strBuild = new StringBuilder();
		
		String result2 = UtilConnector.getComparison();
		strBuild.append(result2);
		strBuild.append("\n");
		
		String result3 = UtilConnector.getSumAllNum();
		strBuild.append(result3);
		strBuild.append("\n");
		
		String result4 = UtilConnector.getSubtraction();
		strBuild.append(result4);
		
		String result5 = UtilConnector.getSumOneNum();
		strBuild.append(result5);
		
		System.out.println(strBuild.toString());
	}
}
