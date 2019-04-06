package hojatrabajo8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RightTest {

	@Test
	void testright() {
		VectorHeap test = new VectorHeap();
		int result = test.right(5);
		assertEquals(12, result);
	}

}
