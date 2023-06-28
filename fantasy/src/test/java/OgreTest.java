import com.codeclan.example.ITargetable;
import com.codeclan.example.enemy.EnemyReward;
import com.codeclan.example.enemy.Orc;
import com.codeclan.example.mythical_creature.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    private Ogre ogre;
    private Orc orc;

    @Before
    public void before(){
        ogre = new Ogre("Obran", 30, 200);
        orc = new Orc(30,300, true, EnemyReward.HP);
    }
    @Test
    public void canHaveName(){
        assertEquals("Obran", ogre.getName());
    }
    @Test
    public void hasAttackPower(){
        assertEquals(30, ogre.getAttack());
    }
    @Test
    public void hasHealth(){
        assertEquals(200, ogre.getHealth());
    }
    @Test
    public void canAttack(){
        ogre.attack(orc);
        assertEquals(270, orc.getHealth());
    }
    @Test
    public void canBeDamaged(){
        orc.attack(ogre);
        assertEquals(170 , ogre.getHealth());
    }
}
