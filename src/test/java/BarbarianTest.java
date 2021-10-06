import Game.Components.DefensiveItem;
import Game.Components.Weapon;
import Game.Player.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;
    DefensiveItem defensiveItem;

    @Before
    public void before(){
        barbarian = new Barbarian(100, weapon, defensiveItem);
    };

    @Test
   public void hasHealth(){
        assertEquals(100, barbarian.getHealth());
    }
}
