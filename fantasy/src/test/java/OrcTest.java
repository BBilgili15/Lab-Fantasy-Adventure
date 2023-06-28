import com.codeclan.example.character.Spells;
import com.codeclan.example.character.Wizard;
import com.codeclan.example.enemy.EnemyReward;
import com.codeclan.example.enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {
    private Orc orc;
    private Wizard wizard;

    @Before
    public void before() {
        orc = new Orc(50, 100, true, EnemyReward.MP);
        wizard = new Wizard("Ben The Wise", 100, 50, 20, 100);
    }

    @Test
    public void orcCanBeKilled() {
        wizard.setSelectedSpell(Spells.LIGHTNING_STRIKE);
        wizard.castSpell(orc);
        orc.receiveDamage(wizard.getSpellPower());
        assertEquals(false, orc.isAlive());
    }

}
