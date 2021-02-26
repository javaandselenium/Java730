package string;

public class Test0 {

	public static void main(String[] args) {
		String s=" I LOVE JAVA ";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.contains("JAVA"));
        System.out.println(s.endsWith(" "));
        System.out.println(s.equals(" I LOVE JAVA "));
        System.out.println(s.equalsIgnoreCase(" i love java "));
	System.out.println(s.concat("selenium"));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	}

}
