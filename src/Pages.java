import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Your Age");
    int age = scan.nextInt();
    int minpagestoread = (100 - age);
    System.out.println("The minimum number of pages you need to read before giving up on a book is: " + minpagestoread);
    }
}
