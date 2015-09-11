import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KarateChopTest{

    @Test
    public void test(){
        KarateChop karateChop = new KarateChop();
        
        assertEquals(-1, karateChop.chop(3, new ChopArray(new int[]{})));
        assertEquals(-1, karateChop.chop(3, new ChopArray(new int[]{1})));
        assertEquals(0,  karateChop.chop(1, new ChopArray(new int[]{1})));
        assertEquals(0,  karateChop.chop(1, new ChopArray(new int[]{1, 3, 5})));
        assertEquals(1,  karateChop.chop(3, new ChopArray(new int[]{1, 3, 5})));
        assertEquals(2,  karateChop.chop(5, new ChopArray(new int[]{1, 3, 5})));
        assertEquals(-1, karateChop.chop(0, new ChopArray(new int[]{1, 3, 5})));
        assertEquals(-1, karateChop.chop(2, new ChopArray(new int[]{1, 3, 5})));
        assertEquals(-1, karateChop.chop(4, new ChopArray(new int[]{1, 3, 5})));
        assertEquals(-1, karateChop.chop(6, new ChopArray(new int[]{1, 3, 5})));
        assertEquals(0,  karateChop.chop(1, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(1,  karateChop.chop(3, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(2,  karateChop.chop(5, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(3,  karateChop.chop(7, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(-1, karateChop.chop(0, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(-1, karateChop.chop(2, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(-1, karateChop.chop(4, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(-1, karateChop.chop(6, new ChopArray(new int[]{1, 3, 5, 7})));
        assertEquals(-1, karateChop.chop(8, new ChopArray(new int[]{1, 3, 5, 7})));
    }
}
