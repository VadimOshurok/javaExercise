package Exercise1;

import java.util.Arrays;

public class StringArrayUtil {
	
	public static String numMassive(String[] line) {
		int i1=0;
		int sum=0;
		String result ="";
		for (int i = 0; i < line.length; i++) {
			i1 = Integer.parseInt(line[i]);
			sum += i1;
		}	
		result = String.valueOf(sum);
		return result;
	}
	
	public static String sort(String[] line) {
		Arrays.sort(line);
		StringBuilder strBuilder = new StringBuilder("");
		
		for(int i = 0; i <  line.length; i++) {
			strBuilder.append(line[i]);	
			strBuilder.append(" ");
		}
		return strBuilder.toString();
	}
	
	public static String textMassive(String text) {
		StringBuilder strBuilder = new StringBuilder("");
		
		for (String retval : text.split(" ")) {
			String[] words = {retval};
			for (String word : words) {
				strBuilder.append(word);
				strBuilder.append(" ");
			}
		}
		return strBuilder.toString();
	}
	
	public String upperWords(String[] words) {
		StringBuilder strBuilder = new StringBuilder("");
		
		for(String word:words){
			String first = word.substring(0,1).toUpperCase();
			String all = word.substring(1);
			strBuilder.append(first);
			strBuilder.append(all);
			strBuilder.append(" ");
		}
		return strBuilder.toString();
	}
}
