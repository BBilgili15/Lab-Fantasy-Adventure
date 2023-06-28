import com.codeclan.example.character.Knight;
import com.codeclan.example.enemy.EnemyReward;
import com.codeclan.example.enemy.Orc;
import com.codeclan.example.weapons.Sword;
import com.codeclan.example.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    private Knight knight;
    private Weapon sword;
    private Orc orc;

    @Before
    public void before() {
        knight = new Knight("Panos The Great", 100,
                50, 100, 20, 30);
        sword = new Sword("Excalibur", 50, 50);
        orc = new Orc(30, 300, true, EnemyReward.MP);
    }

    @Test
    public void canHoldSword() {
        knight.addWeapon(sword);
        knight.setSelected(sword);
        assertEquals(sword, knight.getSelected());
    }
    @Test
    public void canReceiveDamage(){
        knight.receiveDamage(40);
        assertEquals(90,knight.getHealth());
    }

    @Test
    public void canGetHealed() {
        knight.receiveDamage(50);
        knight.getHealed(20);
        assertEquals(100, knight.getHealth());
    }
    @Test
    public void canAttack(){
        knight.addWeapon(sword);
        knight.setSelected(sword);
        knight.attack(orc);
        assertEquals(150, orc.getHealth());
    }


}
