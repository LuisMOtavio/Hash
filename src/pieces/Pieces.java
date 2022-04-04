package pieces;

import board.Board;

public class Pieces {

	private Position position;
	private Type type;

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Pieces(Position position, Type type) {

		this.position = position;
		this.type = type;
	}

}
