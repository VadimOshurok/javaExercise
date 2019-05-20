package Exercise1;

public class Main {	
	public static void main(String[] args) {
		StringArrayUtil numMassive = new StringArrayUtil();
		String[] line = {"14", "28", "11","19", "55"};

		String res1 = numMassive.numMassive(line);
		StringBuilder strBuild = new StringBuilder("Сумма чисел в массиве = ");
		strBuild.append(res1);
		strBuild.append("\n");

		StringArrayUtil sort = new StringArrayUtil();
		String res = sort.sort(line);
		
		strBuild.append("Сортировка чисел в массиве: ");
		strBuild.append(res);
		strBuild.append("\n");
		
		StringArrayUtil textMassive = new StringArrayUtil();
		String text = "пункт номер 3";
		
		String result1 = textMassive.textMassive(text);
		strBuild.append(result1);
		strBuild.append("\n");
		
		StringArrayUtil arrayUtil = new StringArrayUtil();
		String[] words = { "про", "про", "фыв" };
		
		String result = arrayUtil.upperWords(words);
		strBuild.append(result);
		
		System.out.println(strBuild.toString());
	}
}
