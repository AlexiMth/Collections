package collections;

import org.junit.jupiter.api.Test;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;

public class TestFibonacci {

    @Test
    public void testFibonacciSeq() {
        Fibonacci fibonacci = new Fibonacci(8);
        Iterator<Integer> iterator = fibonacci.iterator();
        assertEquals(1, iterator.next());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(3, iterator.next());
        assertEquals(5, iterator.next());
        assertEquals(8, iterator.next());
    }

    @Test
    public void testFiboIteratorHasNext() {
        FiboIterator iterator = new FiboIterator(10);
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testFiboIteratorNext() {
        FiboIterator iterator = new FiboIterator(10);
        assertEquals(1, iterator.next()); 
        assertEquals(1, iterator.next()); 
        assertEquals(2, iterator.next()); 
        assertEquals(3, iterator.next()); 
        assertEquals(5, iterator.next()); 
        assertEquals(8, iterator.next()); 
        assertEquals(13, iterator.next()); 
        assertEquals(21, iterator.next()); 
        assertEquals(34, iterator.next()); 
        assertEquals(55, iterator.next());
        assertFalse(iterator.hasNext()); 
    }

}
