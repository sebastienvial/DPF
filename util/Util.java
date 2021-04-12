package util;

public class Util {

	public static int calculCalorie(String value) {
		if(value != null && value.length() > 0) {
			char[] charArray = value.toCharArray();
			int calorie = 0;
			for (char c : charArray) {
				calorie = calorie + (int)c;
			}
			return calorie;
		}
		return 1;
	}
	
}
