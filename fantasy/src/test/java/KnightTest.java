import com.codeclan.example.character.Knight;
import com.codeclan.example.weapons.Sword;
import com.codeclan.example.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    private Knight knight;
    private Weapon sword;

    @Before
    public void before() {
        knight = new Knight("Panos The Great", 100, 50, 100, 20, 200);
        sword = new Sword("Excalibur", 50, 50);
    }

    @Test
    public void canHoldSword() {
        knight.addWeapon(sword);
        knight.setSelected(sword);
        assertEquals(sword, knight.getSelected());
    }

    @Test
    public void canGetHealed() {
        knight.setHealth(50);
        knight.getHealed(50);
        assertEquals(100, knight.getHealth());
    }


}
