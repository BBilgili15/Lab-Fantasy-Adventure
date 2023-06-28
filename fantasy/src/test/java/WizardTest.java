import com.codeclan.example.character.Spells;
import com.codeclan.example.character.Wizard;
import com.codeclan.example.enemy.EnemyReward;
import com.codeclan.example.enemy.Orc;
import com.codeclan.example.mythical_creature.MythicalCreature;
import com.codeclan.example.mythical_creature.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class WizardTest {
    private Wizard wizard;
    private MythicalCreature creature;
    private Orc orc;
    @Before
    public void before(){
        wizard= new Wizard("Ben the Wise", 75, 150, 30, 80 );
        creature = new Ogre("Lily", 45, 200);
        orc = new Orc(30, 300, true, EnemyReward.MP);

    }

    @Test
    public void canHaveAbilities(){
        wizard.setSelectedSpell(Spells.FIREBALL);
        assertEquals(50, wizard.getSelectedSpellValue());
    }
    @Test
    public void canHaveCreature(){
        wizard.setSelectedCreature(creature);
        assertEquals(creature, wizard.getSelectedCreature());
    }

    @Test
    public void canReceiveDamage(){
        wizard.receiveDamage(40);
        assertEquals(35,wizard.getHealth());
    }
    @Test
    public void canGetHealed() {
        wizard.receiveDamage(50);
        wizard.getHealed(50);
        assertEquals(75, wizard.getHealth());
    }
    @Test
    public void canAttack(){
        wizard.setSelectedCreature(creature);
        wizard.setSelectedSpell(Spells.FIREBALL);
        wizard.castSpell(orc);
        assertEquals(125, orc.getHealth());
    }

}
