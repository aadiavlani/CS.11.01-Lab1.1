import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your age");
      int age = scan.nextInt();
      int datingage = ( 7 + ( age / 2 ) );
      System.out.println(datingage);
    }
}
