package Samples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorSquareRootTest {
    @Test
    public void testA() {
        assertEquals(5, FloorSquareRoot.floorSqrt(11));
    }

    @Test
    public void testB() {
        assertEquals(6, FloorSquareRoot.floorSqrt(20));
    }
}