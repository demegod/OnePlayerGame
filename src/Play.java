import java.util.Scanner;

public class Play {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("What do you want to play? ");
		String game = in.nextLine();
		if (game.equals("frank")){
			System.out.println("What is the target?");
			String target = in.nextLine();
			Frank newGame = new Frank(target);
			String repeated = new String(new char[100]).replace("\0", " ");
			System.out.println(repeated);
			runGame(newGame);
		}
//		testFrank();
	}
	
	public static void testFrank(){
		
//		Frank testA = new Frank("pizza");
//		testA.makePlay(in.nextLine());
//		System.out.println(testA.stateOfGame());
//		while (!testA.playOver()){
//			System.out.println("Guess again:");
//			testA.makePlay(in.nextLine());
//			System.out.println(testA.stateOfGame());
//		}
//		System.out.println("Game Over!");
		
//		Frank testB = new Frank("jam");
//		testB.makePlay(in.nextLine());
//		System.out.println(testB.stateOfGame());
//		while (!testB.playOver()){
//			System.out.println("Guess again:");
//			testB.makePlay(in.nextLine());
//			System.out.println(testB.stateOfGame());
//		}
//		System.out.println("Game Over!");
		
//		Frank testC = new Frank("CrAzY");
//		testC.makePlay(in.nextLine());
//		System.out.println(testC.stateOfGame());
//		while (!testC.playOver()){
//			System.out.println("Guess again:");
//			testC.makePlay(in.nextLine());
//			System.out.println(testC.stateOfGame());
//		}
//		System.out.println("Game Over!");
		
	}
	public static void runGame(OnePlayerGame obj){
		while (!obj.playOver()){
			System.out.println(obj.stateOfGame());
			System.out.println("Type in a Play: ");
			String inPlay = in.nextLine();
			obj.makePlay(inPlay);
		}
		System.out.println("GAME OVER");
		System.out.println(obj.stateOfGame());
	}
}