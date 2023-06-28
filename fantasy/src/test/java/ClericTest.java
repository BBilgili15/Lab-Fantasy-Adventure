import com.codeclan.example.character.Cleric;
import com.codeclan.example.weapons.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    private Cleric cleric;
    private Potion potion;

    @Before
    public void before(){
        cleric = new Cleric("Lulu", 100,150, 20, 20);
        potion = new Potion("Minor Healing Potion", 20, 5);
    }
    @Test
    public void canHoldAPotion(){
        cleric.setSelectedPotion(potion);
        assertEquals(potion, cleric.getSelectedPotion());
    }
    @Test
    public void canStorePotions(){
        cleric.addPotion(potion);
        assertEquals(1,cleric.getTheNumberOfPotions());
    }
    @Test
    public void canPickPotionFromPotions(){
        cleric.addPotion(potion);
        cleric.pickPotionFromPotions(potion);
        assertEquals(potion, cleric.getSelectedPotion());
        assertEquals(0, cleric.getTheNumberOfPotions());
    }

    @Test
    public void canReceiveDamage(){
        cleric.receiveDamage(40);
        assertEquals(60,cleric.getHealth());
    }

    @Test
    public void canGetHealed() {
        cleric.receiveDamage(50);
        cleric.getHealed(40);
        assertEquals(90, cleric.getHealth());
    }
    @Test
    public void canHealPeople(){
        cleric.addPotion(potion);
        cleric.receiveDamage(70);
        cleric.pickPotionFromPotions(potion);
        cleric.usePotion(cleric);
        assertEquals(50, cleric.getHealth());
    }
}
