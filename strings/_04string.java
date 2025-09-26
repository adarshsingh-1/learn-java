package strings;

public class _04string {
  public static void main(String[] args) {
    //number of vowels and consonants


    String str = "HelloWorld";
    str = str.toLowerCase();
    int vowels = 0, consonants = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if ("aeiou".indexOf(ch) != -1) {
        vowels++;
      } else if (ch >= 'a' && ch <= 'z') {
        consonants++;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);

  }

}
