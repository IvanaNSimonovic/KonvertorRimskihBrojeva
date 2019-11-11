package konvertorRimskih;
import java.util.HashMap;

public class RomanConverter {
	private static HashMap<Character, Integer> map = new HashMap<>();
	static {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}
	
	public static int convert(String roman) {		
		int num = 0;
		int acc = 0;
		
		for(int i=0; i<roman.length(); i++) {
			int val = map.get(roman.charAt(i));
			if(acc!=0 && val > acc) {
				num += val - acc;
				acc = 0;
			} else {
				num += acc;
				acc = val;
			}
		}
		
		return num + acc;
	}
	
	public static void main(String[] args) {
		String[] tests = {"MCMLXXIII", "IV", "IX", "LVIII", "MCMLXXXIV", "MCMXCIV"};
		for(String test: tests)
			System.out.printf("%s => %d\n", test, convert(test));
	}
