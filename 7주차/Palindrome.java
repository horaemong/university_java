import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean numOption = true;

    while (numOption) {

      System.out.print("Enter a word:");
      String word = input.nextLine();

      String word_Lower = word.toLowerCase();

      // 홀짝일대 값 구분
      int word_length_middle = (word.length() % 2 == 0) ? word.length()/2 : (word.length() / 2);
      // 단어 확인
      String front = word_Lower.substring(0, word_length_middle);
      String back_reverse = word_Lower.substring(word_length_middle+1);
      String back = "";

      // back 순서 정렬
      for (int i = back_reverse.length() - 1; i >= 0; i--) {
        back += back_reverse.charAt(i);
      }



      if (front.equals(back)) {
        System.out.println(String.format("'%s' is a Palindrome.", word));
      } else {
        System.out.println(String.format("'%s' is NOT a Palindrome.", word));
      }

  

      System.out.print("Do you want to check another word? (yes/no): ");
      String in = input.nextLine();
      switch (in) {
        case "yes":
          break;
        case "no":
          numOption = false;
          System.out.print("exit program");
          break;
        default:
          System.out.print("wrong value. error, exit program");
          numOption = false;
          break;
      }
    }
    
    input.close();
  }
}
