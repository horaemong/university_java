import java.util.Scanner;


public class DistanceChart {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to distance chart!");
        System.out.println("1. Miles to Kilometers");
        System.out.println("2. Kilometers to Miles");
        System.out.print("Enter an option: ");

        String option = in.nextLine();

        while (!isOptionValid(option)) {
            System.out.println(option + " is an invalid option. Valid options are 1 or 2.");
            System.out.print("Enter an option: ");
            option = in.nextLine();
        }

        // If we reach here, then the option is valid.
        int numOption = Integer.parseInt(option);

        System.out.print("Enter 2 integers between 1 to 1000 (inclusive) separated by a space: ");
        int start = in.nextInt();
        int end = in.nextInt();
        while (!isRangeValid(start, end)) {
            System.out.println("The range " + start + " " + end + " is NOT a valid range. Try again.");
            System.out.print("Enter 2 integers between 1 to 1000 (inclusive) separated by a space: ");
            start = in.nextInt();
            end = in.nextInt();
        }

        switch (numOption) {
            case 1:
                System.out.println("MILES | KMS");
                convertMilesToKilometers(start, end);
                break;

            case 2:
                System.out.println(" KMS | MILES");
                convertKilometersToMiles(start, end);
                break;

            default:
                break;
        }

        in.close();

    }


    public static void convertMilesToKilometers(int start, int end) {
        // TODO: write definition here
        for (int i = start; i <= end; i++) {
            System.out.println(" " + Integer.toString(i) + " | " + String.format("%.3f",i*1.609344));
        }
      
    }

    public static void convertKilometersToMiles(int start, int end) {
        // TODO: write definition here
      for (int i = start; i <= end; i++) {
            System.out.println(" " + Integer.toString(i) + " | " + String.format("%.3f",i*0.621371));
        }
    }   

    public static boolean isRangeValid(int start, int end) {
        // TODO: write definition here
        if (start > end) {
            return false;
        } else if (start < 0 || end > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isOptionValid(String option) {
        // TODO: write definition here

        if (option.equals("1") || option.equals("2")) {
            return true;
        } else {
            return false;
        }
    }

}