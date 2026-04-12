import java.util.Scanner;

public class date_validator {
  public static void main(String[] args) {
    System.out.println("Enter a date (format: mm/dd/yyyy): ");

    Scanner input = new Scanner(System.in);
    String data = input.next();

    System.out.println(data.indexOf('/'));

    input.close();
  }
}