package Logic;

public class Board {

 
    String[][] board;
    private int turn;
    private int x;
    private int y;
    private boolean winner;
    
    public Board () {
    	this.board = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7","8","9"}};
    	this.turn = 0;
    	this.winner = false;
    }

    public void getCoordinates(int valor) {
        switch(valor){
            case 1:
                x = 0;
                y = 0;
                break;
            case 2:
                x = 0;
                y = 1;
                break;
            case 3:
                x = 0;
                y = 2;
                break;
            case 4:
                x = 1;
                y = 0;
                break;
            case 5:
                x = 1;
                y = 1;
                break;
            case 6:
                x = 1;
                y = 2;
                break;
            case 7:
                x = 2;
                y = 0;
                break;
            case 8:
                x = 2;
                y = 1;
                break;
            case 9:
                x = 2;
                y = 2;
                break;
            default:
                throw new IllegalArgumentException("No existe cordenada");
        }
    }

    public boolean checkCoordinate(int value) {
        getCoordinates(value);
        if (board[x][y] == "X" || board[x][y] == "O") {
            return false;
        }
        else {
            return true;
        }
    }

    private void makeMove(String player, int value) {
    	getCoordinates(value);
        board[x][y] = player;
    }

    public boolean controlGame(String player) {
    	if(turn>=4) {
	    	if ((board[0][0]==player) && (board[0][1]==player) && (board[0][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][0]==player) && (board[1][0]==player) && (board[2][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][0]==player) && (board[1][1]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][1]==player) && (board[1][1]==player) && (board[2][1]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][1]==player) && (board[1][0]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][1]==player) && (board[1][2]==player) && (board[2][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][2]==player) && (board[1][2]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[1][0]==player) && (board[1][1]==player) && (board[1][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[1][0]==player) && (board[2][1]==player) && (board[0][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[1][2]==player) && (board[2][1]==player) && (board[0][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[2][0]==player) && (board[2][1]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][2]==player) && (board[1][1]==player) && (board[2][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
    	}
        return false;
    }

	public String returnPlayer() {
		if(turn % 2 == 0) {
			return "X";
		}
		else {
			return "O";
		}
	}
	
	private void passTurn() {
		turn++;
	}
	
    public int getTurn() {
		return turn;
	}

	public String pressButton(int position) {
		if (checkCoordinate(position)) {
			String player = returnPlayer();
			makeMove(player, position);
			controlGame(player);
			passTurn();
			return player;
		}
		return "";
	}
	
	public boolean getWinner () {
		return this.winner;
	}
    
	
}