package programa2A;

import static org.junit.Assert.*;

import org.junit.Test;

public class positionTest {

	@Test
	public void test1() {
		position s = new position();
		int x[] = new int[3];
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		s.pos(x, 3);
				
	}
	
	@Test
	public void test2() {
		position s = new position();
		int x[] = new int[3];
		
		x[0] = 10;
		x[1] = 30;
		x[2] = 20;
		
		s.pos(x, 3);
				
	}
	
	
	@Test
	public void test3() {
		position s = new position();
		int x[] = new int[3];
		
		x[0] = 30;
		x[1] = 10;
		x[2] = 20;
		
		s.pos(x, 3);
				
	}
	
	
	@Test
	public void test4() {
		position s = new position();
		int x[] = new int[5];
		
		x[0] = 80;
		x[1] = 50;
		x[2] = 10;
		x[3] = 5;
		x[4] = 15;
		
		s.pos(x, 5);
				
	}

}
