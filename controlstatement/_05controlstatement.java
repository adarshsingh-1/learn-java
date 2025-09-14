package controlstatement;

public class _05controlstatement {
  public static void main(String[] args) {
    // jump statement

    // break
    for (int i = 1; i <= 5; i++) {
      if (i == 3)
        break;
      System.out.println(i);
    }

    // continue
    for (int i = 1; i <= 5; i++) {
      if (i == 3)
        continue;
      System.out.println(i);
    }

  }

}
