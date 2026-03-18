import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    System.out.println("Enter the points scored by the student : ");

    Scanner input = new Scanner(System.in);

    float point = input.nextFloat();

    if (point > 100 || point < 0) {
      System.out.println("The points should be in the range from 0 to 100");
    }
    else {
      if (point>=90) {
        System.out.println("The letter grade for the student is: A");
      } else if (point >= 80) {
        System.out.println("The letter grade for the student is: B");
      } else if (point >= 70) {
        System.out.println("The letter grade for the student is: C");
      } else if (point >= 60) {
        System.out.println("The letter grade for the student is: D");
      } else {
        System.out.println("The letter grade for the student is: F");
      }
    }

    input.close();


  }




}
