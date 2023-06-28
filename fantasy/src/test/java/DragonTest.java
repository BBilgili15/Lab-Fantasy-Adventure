import com.codeclan.example.enemy.EnemyReward;
import com.codeclan.example.enemy.Orc;
import com.codeclan.example.mythical_creature.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    private Dragon dragon;
    private Orc orc;

    @Before
    public void before(){
        dragon = new Dragon("Fly", 40, 170);
        orc = new Orc(30, 300, true, EnemyReward.MP);
    }
    @Test
    public void canHaveName(){
        assertEquals("Fly", dragon.getName());
    }
    @Test
    public void hasAttackPower(){
        assertEquals(40, dragon.getAttack());
    }
    @Test
    public void hasHealth(){
        assertEquals(170, dragon.getHealth());
    }
    @Test
    public void canAttack(){
        dragon.attack(orc);
        assertEquals(260, orc.getHealth());
    }
    @Test
    public void canBeDamaged(){
        orc.attack(dragon);
        assertEquals(140 , dragon.getHealth());
    }
}
