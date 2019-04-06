package hojatrabajo8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeftTest {

	@Test
	void testleft() {
		VectorHeap test = new VectorHeap();
		int result = test.left(5);
		assertEquals(11, result);
	}

}
