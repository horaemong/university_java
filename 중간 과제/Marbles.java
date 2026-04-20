import java.util.Scanner;

public class Marbles {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int condition = 1;
    String valid;


    printHelp();
    String player_1 = null;
    String player_2 = null;
    while (condition == 1) {
      System.out.print("Options: (P)LAY, (H)ELP, (E)XIT. Enter your choice: ");
      String option = in.nextLine();

      switch (isOptionValid(option)) {
        case 'p':
          // 플레이어 이름
          if (player_1 == null) {
            System.out.print("Enter player 1's name: ");
            player_1 = in.nextLine();
            System.out.print("Enter player 2's name: ");
            player_2 = in.nextLine();
          }
  
          // 구슬 세팅
          int total;
          int max;

          
          while (true) {
            System.out.print("Enter the total number of marbles in the bag: ");
            if (in.hasNextInt()) {
              total = in.nextInt();

              if (total <= 0) {
                System.out.println(total + " is not a valid number of marbles. Try again.");
              } else {
                break;
              }
            } else {
              String invalidInput = in.next();
              System.out.println(invalidInput + " is not a valid number of marbles. Try again.");
            }
          }      
          
            

          
          while (true) {
            System.out.print("Enter the max number of marbles a player can pick, each turn: ");
            if (in.hasNextInt()) {
              max = in.nextInt();
              if (max <= 0 || max > total) {
                System.out.println(max + " is not a valid number of marbles. Try again.");
              } else {
                break;
              }
            } else {
              String invalidInput = in.next();
              System.out.println(invalidInput + " is not a valid number of marbles. Try again.");
            }
          }
          

          // 이제 게임을 해
          int nowPlayer = 1;
          int pick;
          while (total > 0) {
            pick = 0;
            

            // 플레이어 구분
            String currentPlayer = (nowPlayer == 1) ? player_1 : player_2;
            nowPlayer = (nowPlayer == 1) ? 2:1;

            // 구슬 유효성 검사
            while (true) {
              System.out.println("There are " + total + " marble(s) in the bag.");
              System.out.print(currentPlayer + ", how many marbles do you want to pick? ");
              if (in.hasNextInt()) {
                pick = in.nextInt();

                if (pick <= 0 || pick > total || pick > max) {
                  System.out.println(pick + " is not a valid number of marbles. Try again.");
                } else {
                  break;
                }
              } else {
                String invalidInput = in.next();
                System.out.println(invalidInput + " is not a valid number of marbles. Try again.");
              }

            }
            total -= pick;
            
            
            
          }
          
          // 마지막 구슬을 집었을때 이기는 플레이어는 nowplayer
          if (nowPlayer == 1) {
            System.out.println(player_2 + " picks up the last marble.");
            System.out.println(player_1 + " wins!");
          } else {
            System.out.println(player_1 + " picks up the last marble.");
            System.out.println(player_2 + " wins!");
          }
          in.nextLine();
          break;
        case 'e':
          System.out.println("Thanks for playing Marbles!");
          condition = 0;
          break;
        case 'h':
          printHelp();
          break;

        default:
          System.out.println("Option not recognized.");
          break;
      }

    }
    

    in.close();
  }
  
  public static char isOptionValid(String option) {
    String option_lower = option.toLowerCase();
    if (option_lower.equals("p") || option_lower.equals("play")) {
      return 'p';
    } else if (option_lower.equals("e") || option_lower.equals("exit")) {
      return 'e';
    } else if (option_lower.equals("h") || option_lower.equals("help")) {
      return 'h';
    } else {
      return 0;
    }
  }
  
  public static void printHelp() {
    System.out.println("Welcome to Marbles!");
    System.out.println("In this game, there are n marbles in a bag.");
    System.out.println("On each turn, the current player may pick up 1 to k marbles.");
    System.out.println("The player who picks up the last marble loses the game.");
  }
}
