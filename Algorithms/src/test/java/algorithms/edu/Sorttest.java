package algorithms.edu;

import org.junit.Test;
import static junit.framework.Assert.*;

public class Sorttest {
	@Test
	public void testSorting() {
		int[] toSort = { 5, 2, 4, 6, 1, 3 };
		int[] sorted = { 1, 2, 3, 4, 5, 6 };
		Insertionsort.inserstionSort(toSort);
		assertEquals(toSort, sorted);
	}
}