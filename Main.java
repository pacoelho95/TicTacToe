import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		TTT newGame = new TTT();
		
		System.out.println("|------------------------------------|");
		System.out.println("  " + "Welcome to a Game of Tic Tac Toe.");
		System.out.println("|------------------------------------|");
		System.out.println("         " + "- by PedroCoelho");
		System.out.println("|------------------------------------|");
		System.out.println("             " + "Use X or O");
		System.out.println("|------------------------------------|");
		
		int aux = 0;
		int res1 = 0;
		int res2 = 0;
		
		// Initializes blank board
		newGame.initBoard();
		
		// Game cycle
		do {
			
			// Prints board
			newGame.printBoard();
			
			// Checking if GameOver
			if (newGame.isGameOver() == 11) {
				System.out.println("\n" +"Player 1 has WON!");
				break;
			} else if (newGame.isGameOver() == 22) {
				System.out.println("\n" + "Player 2 has WON!");
				break;
			}
			
			
			// Asks Player1 for input
			if ((aux == 0) || (aux == 1)) {
				
				Scanner input = new Scanner(System.in);
				
				do {
					// Gets X Coordinates from Player 1
					System.out.print("Player 1, ROW coordinates: ");
					int inputX = input.nextInt();
				
					
					// Gets Y Coordinates from Player 1
					System.out.print("Player 1, COL coordinates: ");
					int inputY = input.nextInt();
					
					res1 = newGame.setMark(inputX, inputY, 1);
				} while (res1 != 1);
				
				aux = 2;
				
			}
			
			// Asks Player2 for input
			else if (aux == 2) {
				
				Scanner input = new Scanner(System.in);				
				
				do {
					// Gets X Coordinates from Player 1
					System.out.print("Player 2, ROW coordinates: ");
					int inputX = input.nextInt();
				
					
					// Gets Y Coordinates from Player 1
					System.out.print("Player 2, COL coordinates: ");
					int inputY = input.nextInt();
					
					res2 = newGame.setMark(inputX, inputY, 2);
				} while (res2 != 1);
				
				aux = 1;
			}
			
		} while(true);
		
	}

}
