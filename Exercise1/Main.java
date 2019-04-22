package Exercise1;

public class Main {	
	public static void main(String[] args) {
		StringArrayUtil numMassive = new StringArrayUtil();
		String[] line = {"14", "12", "11","19"};
		
		String res1 = numMassive.numMassive(line);
		StringBuilder strBuffer = new StringBuilder("Сумма числе в массиве =");
		strBuffer.append(res1);
		System.out.println(strBuffer.toString());

		StringArrayUtil sort = new StringArrayUtil();
		System.out.print("Сортировка чисел в массиве: ");
		String res = sort.sort(line);
		
		StringArrayUtil textMassive = new StringArrayUtil();
		String text = "пункт номер 3";
		
		String result1 = textMassive.textMassive(text);
		
		StringArrayUtil arrayUtil = new StringArrayUtil();
		String[] words = { "про", "про", "фыв" };
		
		String result = arrayUtil.upperWords(words);
		System.out.print(result);
	}
}
