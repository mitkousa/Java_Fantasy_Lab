import Game.Character.Orc;
import Game.Components.DefensiveItem;
import Game.Components.Weapon;
import Game.Character.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;
    DefensiveItem defensiveItem;
    Orc orc;

    @Before
    public void before(){
        barbarian = new Barbarian(100, Weapon.AXE, DefensiveItem.SHIELD);
        orc = new Orc(100, Weapon.POTATO);
    };

    @Test
   public void hasHealth(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void canDefend(){
        assertEquals(100, orc.getHealth());
        barbarian.attack(20, orc);
        assertEquals(80, orc.getHealth());

    }
}
