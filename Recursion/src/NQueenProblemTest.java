import static org.junit.Assert.*;

import org.junit.Test;


public class NQueenProblemTest {

	@Test
	public void test() {
		NQueenProblem queen = new NQueenProblem(); 
        queen.solveNQ(); 
        assertEquals(true, queen.solveNQ());
	}

}
