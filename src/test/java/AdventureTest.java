import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class AdventureTest {
    @Test
    public void newAdventure_InstantiatesCorrectly () throws Exception {
        Adventure testAdventure = new Adventure("Kate", "left", "ogre");
        assertEquals(true, testAdventure instanceof Adventure);
    }

    @Test
    public void newAdventure_turnLeft_true() throws Exception {
        Adventure testAdventure = new Adventure("Kate", "right", "ogre");
        assertEquals("left", testAdventure.getDirection());
    }
}