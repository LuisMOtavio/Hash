package board;

import pieces.Pieces;
import pieces.Position;
import pieces.Type;

public class Board {

	private int rows;
	private int columns;
	private Pieces[][] pieces;

	public Pieces[][] getPieces() {
		return pieces;
	}

	public void setPieces(Pieces[][] pieces) {
		this.pieces = pieces;
	}

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}

	public void placeBoardX(char a,int row, int column) {
		for (int i = 0; i < rows; i++) {
			System.out.println();
			System.out.print(rows - i + "  ");

			for (int j = 0; j < columns; j++) {
				System.out.print("_");
				if (pieces[i][j] == null) {
					if (j < 2 ) {
						System.out.print("| ");
					}
				}else {
					System.out.print(  " ");
				}
			}

		}
		System.out.println();
		System.out.println("   1  2  3");
		
	}
	

		

	
	public void placeBoard() {
		for (int i = 0; i < rows; i++) {
			System.out.println();
			System.out.print( i + "  ");

			for (int j = 0; j < columns; j++) {
				if (pieces[i][j] == null) {
					if (j < 2 ) {
						System.out.print("| ");
					}
				}else {
					System.out.print("  ");
				}
			}

		}
		System.out.println();
		System.out.println("  0 1 2");
	}

	
	
	
	public void placePiece(Position position,Pieces piece) {
		this.pieces[position.getRow()][position.getColumn()]= piece;
	}
	
	
}
