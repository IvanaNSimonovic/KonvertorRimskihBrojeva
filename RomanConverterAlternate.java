import java.util.HashMap;

public class RomanConverterAlternate {
	private static HashMap<Character, Integer> map = new HashMap<>();
	private static HashMap<String, Integer> exceptions = new HashMap<>();
	static {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		exceptions.put("IV", 4);
		exceptions.put("IX", 9);
		exceptions.put("XL", 40);
		exceptions.put("XC", 90);
		exceptions.put("CD", 400);
		exceptions.put("CM", 900);
	}
	public static int convert(String roman) {
		int num = 0;
		for(String exception: exceptions.keySet()) {
			String replaced = roman.replace(exception, "");
			int times = (roman.length() - replaced.length()) / exception.length();
			num += times * exceptions.get(exception);
			roman = replaced;
		}
		for(char c: roman.toCharArray())
			num += map.get(c);
		
		return num;
	}
	
	public static void main(String[] args) {
		String[] tests = {"MCMLXXIII", "IV", "IX", "LVIII", "MCMLXXXIV"};
		for(String test: tests)
			System.out.printf("%s => %d\n", test, convert(test));
	}
}
