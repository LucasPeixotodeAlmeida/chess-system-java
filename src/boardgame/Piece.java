package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //se nada for atribuido a position o valor ja é nulo
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
}
