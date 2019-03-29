
public class TTT {
	// Atributes
	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLS = 3;
	
	// Constructor
	public TTT() {
		this.board = new String[ROWS][COLS];
	}
	
	// Initializes a blank board
	public void initBoard() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				this.board[i][j] = "   ";
			}
		}
	}
	
	/**
	 *  Recieves coordinates and fills the board
	 * Returns:
	 *  1 if ok
	 * -1 if x,y is out of bounds
	 * -2 if x,y is already filled
	 * -3 if other
	 */
	public  int setMark(int x, int y, int player) {
		x = x - 1;
		y = y - 1;
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			System.out.println("Coordinates out of bounds. Repeat");
			return -1;
		} else if (board[x][y] != "   ") {
			System.out.println("There's already a number in there. Repeat");
			return -2;
		} else if (player == 1) {
			board[x][y] = " X ";
			return 1;
		} else if (player == 2){
			board[x][y] = " O ";
			return 1;
		}
		System.out.println("ERROR 404. Repeat");
		return -3;
	}
	
	// Checks winner
	// 11 if player 1
	// 22 if player 2
	// 0 if noone has won
	public int isGameOver() {
		for (int c = 0; c < 8; c++) {
			String line = null;
			switch (c) {
				case 0:
					line = board[0][0] + board[0][1] + board[0][2];
					break;
				case 1:
					line = board[1][0] + board[1][1] + board[1][2];
					break;
				case 2:
					line = board[2][0] + board[2][1] + board[2][2];
					break;
				case 3:
					line = board[0][0] + board[1][0] + board[2][0];
					break;
				case 4:
					line = board[0][1] + board[1][1] + board[2][1];
					break;
				case 5:
					line = board[0][2] + board[1][2] + board[2][2];
					break;
				case 6:
					line = board[0][0] + board[1][1] + board[2][2];
					break;
				case 7:
					line = board[2][0] + board[1][1] + board[0][2];
					break;
					
			}
			
			// System.out.println(line + "|");
			if (line.equals(" X  X  X ")) {
				return 11;
			} else if (line.equals(" O  O  O ")) {
				return 22;
			}
		}
		return 0;
	}
	
	// Prints board
	public String printBoard() {
		String strBoard = "";
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				strBoard += board[i][j];
				if (j != (ROWS - 1)) {
					strBoard += "|";
				} else {
					strBoard += "\n";
				}
			}
			if (i != (COLS - 1)) {
				strBoard += "---+---+---\n";
			}
		}
		System.out.println(strBoard);
		return strBoard;
	}

}
