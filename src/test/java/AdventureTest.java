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
        Adventure testAdventure = new Adventure("Kate", "left", "ogre");
        assertEquals("left", testAdventure.getDirection());
    }

    @Test
    public void newAdventure_seeResult() throws Exception {
        Adventure testAdventure = new Adventure("Kate", "left", "Ogre eats you and you die");
            assertEquals("Ogre eats you and you die.", testAdventure.resultOfAction());

    }
    @Test
    public void newAdventure_seeResult_1() throws Exception{
        Adventure testAdventure = new Adventure("Kate", "right", "Do you want to eat the berries? Yes or No?");
        assertEquals("Do you want to eat the berries? Yes or No?", testAdventure.twoNewOptions());
    }

    @Test
    public void newAdventure_seeResult_2() throws Exception{
        Adventure testAdventure = new Adventure("Kate", "right", "Do you want to eat the berries? Yes or No?");
        assertEquals(false, testAdventure.twoNewOptionsDoDie("Yes"));
    }

}