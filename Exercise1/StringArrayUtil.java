package Exercise1;

import java.util.Arrays;

public class StringArrayUtil {
	
	public static String numMassive(String[] line) {
		String result = "";
		int i1=0;
		int sum=0;
		
		for (int i = 0; i < line.length; i++) {
			i1 = Integer.parseInt(line[i]);
			sum += i1;
		}	   
		result += sum;
		return result;
	}
	
	public static String sort(String[] line) {
		String result="";
		Arrays.sort(line);
		StringBuilder strBuilder = new StringBuilder(result);
		
		for(int i = 0; i <  line.length; i++) {
			strBuilder.append(line[i]);	
			strBuilder.append(" ");
		}
		result += strBuilder;
		return result;
	}
	
	public static String textMassive(String text) {
		String result = "";
		StringBuilder strBuilder = new StringBuilder(result);
		
		for (String retval : text.split(" ")) {
			String[] words = {retval};
			for (String word : words) {
				strBuilder.append(word);
				strBuilder.append(" ");
			}
		}
		result += strBuilder;
		return result ;
	}
	
	public String upperWords(String[] words) {
		String result="";
		StringBuilder strBuilder = new StringBuilder(result);
		
		for(String word:words){
			String first = word.substring(0,1).toUpperCase();
			String all = word.substring(1);
			strBuilder.append(first);
			strBuilder.append(all);
			strBuilder.append(" ");
		}
		result += strBuilder;
		return result;
	}
}
