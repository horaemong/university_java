import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter an integer between 0 to 16: ");
			Scanner input = new Scanner(System.in);
			
			// 조건 거르기
			if (input.hasNextInt()) {
				int num = input.nextInt();
				if(num<0) {
					System.out.println(String.valueOf(num) +" is a negative integer. Try again.");
				}
				else if(num > 16) {
					System.out.println(String.valueOf(num) +" is an integer greater than 16. Try again.");
				}
				else {
					long result = 1;
					for(int i = 1; i<=num; i++) {
						result = result*i;
					}
					System.out.println("The factorial of " + String.valueOf(num) + " = " + String.valueOf(result));
				}
			}
			else if(input.hasNextFloat()) {
				float num = input.nextFloat();
				System.out.println(String.valueOf(num) +" is a floating-point number. Try again.");
			}
			else if(input.hasNext()) {
				String num = input.next();
				System.out.println(String.valueOf(num) +" is a string. Try again.");
			}
			
			
			
		}
			
	}
}
