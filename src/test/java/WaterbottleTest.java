import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {
    private Waterbottle testWaterbottle;

    @Before
    public void before() {
        testWaterbottle = new Waterbottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, testWaterbottle.getVolume());
    }

    @Test
    public void drinkFrom() {
        assertEquals(90, testWaterbottle.drink());
    }

    @Test
    public void emptyBottle() {
        assertEquals(0, testWaterbottle.empty());
    }

    @Test
    public void fillBottle() {
        assertEquals(100, testWaterbottle.fill());
    }
}
