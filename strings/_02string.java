package strings;

public class _02string {
  public static void main(String[] args) {
    //common strings method
    String s = "JavaProgramming";

    System.out.println("Length: " + s.length());
    System.out.println("Char at index 2: " + s.charAt(2));
    System.out.println("Substring(0,4): " + s.substring(0, 4));
    System.out.println("Contains 'Pro': " + s.contains("Pro"));
    System.out.println("Equals check: " + s.equals("JavaProgramming"));
    System.out.println("Uppercase: " + s.toUpperCase());
    System.out.println("Lowercase: " + s.toLowerCase());

}

}
