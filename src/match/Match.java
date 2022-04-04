package match;

import board.Board;
import pieces.Type;

public class Match {
	
	private int turn;
	private Type player;

	public void newMatch() {
		Board board = new Board(3,3);
		turn =1;
		player=player.X;
		inicialSetup();
		}
	
	
	
	
	
	public void inicialSetup() {
		
		}
	}

