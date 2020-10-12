package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Logic.Board;


public class boardTest {
	Board board;
	
	@Before
	public void setUp() {
		board = new Board();
		board.pressButton(1);
	}
	
	@Test
	public void realPosition() {
		board.getCoordinates(1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void negativePosition() {
		board.getCoordinates(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void biggerThanMaxPosition() {
		board.getCoordinates(10);//max 9
	}

	@Test
	public void checkCoordinateOcuppied() { //si devuelve falso significa que esta ocupada
		assertFalse(board.checkCoordinate(1));
	}
	
	@Test
	public void checkCoordinateFree() {
		assertTrue(board.checkCoordinate(2));//si devuelve verdadero significa que esta libre
	}
	
	@Test
	public void rightTurn() {
		int turn = board.getTurn();
		assertEquals(1,turn);
	}
	
	@Test
	public void passTurn() {
		board.pressButton(2);
		assertEquals(2,board.getTurn());
	}
	
	@Test
	public void returnPlayerO() {
		assertEquals("O",board.returnPlayer());
	}
	
	@Test
	public void returnPlayerX() {
		board.pressButton(2);
		assertEquals("X",board.returnPlayer());
	}
	
	@Test
	public void controlGamePlayWin() {
		board.pressButton(4);
		board.pressButton(2);
		board.pressButton(5);
		board.pressButton(3);
		assertTrue(board.controlGame("X"));
	}
	
	@Test
	public void controlGamePlayNoWinYet() {
		board.pressButton(4);
		board.pressButton(2);
		board.pressButton(5);
		assertFalse(board.controlGame("O"));
		assertFalse(board.controlGame("X"));
	}
}
