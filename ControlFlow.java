import java.util.Random;
import java.util.Scanner;

public class ControlFlow {
	
	
	private static final String MAX_RANDOM = null;

	public static final int Max = 65;
	
	public static final int Max_Magic =75;
	
	public static final int Max_Random = 10;
	

	public static void main(String[] args) {

		AsciiChars.printNumbers();
		
		AsciiChars.printUpperCase();
		
		AsciiChars.printLowerCase();
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		
		String name = scanner.next();
		
		System.out.println("Hello" + name);
		
		System.out.println("Do you wish to continue? (y/n)");
		String input = scanner.next().toLowerCase();
		
		while (!input.equals("y") && !input.equals("n")) {
			System.out.println("Invalid input, please try again");
			input=scanner.next().toLowerCase();
			
		}
		
		if(input.equals("y")) {
			
			while(true) {
				System.out.println("what is your favorite pets name?");
				String petName= scanner.next();
				
				
				System.out.println("How old is your favorite pet?");
				int petAge = scanner.nextInt();
				
				while (petAge <0) {
					System.out.println("Invalid input,please try again");
					petAge = scanner.nextInt();
					
				}
				
				
				System.out.println("what is your lucky number?");
				int luckyNumber = scanner.nextInt();
				
				
				System.out.println("Do you have a favorite quaterback?(y/n)");
				String in = scanner.next().toLowerCase();
				
				while (!in.equals("y") && !in.equals("n")) {
					System.out.println("invalid input, please try again");
					in = scanner.next().toLowerCase();
					
				}
				int quarterbackNumber = 0;
				
				if(in.equals("y")) {
					System.out.println("what is their jersey number");
					quarterbackNumber = scanner.nextInt();
					
				}
				
				System.out.println("what is two-digit model year of your car?");
				int twoDigitModelYear = scanner.nextInt();
				
				System.out.println("what is your favorite actor or actress name?");
				String favoriteActorName= scanner.next();
				
				System.out.println("Enter a number between 1 and 50");
				int userRandomNumber = scanner.nextInt();
				
				while(userRandomNumber <1 || userRandomNumber >50) {
					System.out.println("Invalid input, please try again");
					userRandomNumber =scanner.nextInt();
					
				}
				
				Random random = new Random();
				
				int magicBall = ((quarterbackNumber *random.nextInt()) % Max_Magic) + 1;
				
				int[] lotteryNumbers = new int[5];
                lotteryNumbers[0] = ((twoDigitModelYear + luckyNumber) % Max) + 1;
                lotteryNumbers[1] = ((userRandomNumber - random.nextInt(userRandomNumber)) % Max) + 1;
                lotteryNumbers[2] = (((int) favoriteActorName.charAt(0)) % Max) + 1;
                lotteryNumbers[3] = (((int) favoriteActorName.charAt(favoriteActorName.length() - 1)) % Max) + 1;
                lotteryNumbers[4] = ((petAge + twoDigitModelYear) % Max) + 1;
				
				System.out.println("Lottery Numbers: ");
				
				for(int i=0; i<5; i ++) {
					
					if(i == 0 ) {
						System.out.println(" " + lotteryNumbers[i]); }
					
					else {
						System.out.println("," + lotteryNumbers[i]);
					}
					System.out.println("Magic ball: " + magicBall);
					
					System.out.println("would you like to answer questions to generate anothe set of number? (y/n)");
					in = scanner.next().toLowerCase();
					
					while (!in.equals("y") && !in.equals("n")) {
						System.out.println("Invalid input, please try again");
						in = scanner.next().toLowerCase();
						
					}
					
					if(in.equals("n")) {
						System.out.println("Thank you..");
						break;
					}else  { 
						System.out.println("Play again.......\n");
					}
					
					System.out.println("please return later to complete the survey");
				
				}
			}
		}
		
		

	}


	

}
