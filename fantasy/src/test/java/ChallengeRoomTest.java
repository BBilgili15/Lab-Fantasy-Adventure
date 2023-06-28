import com.codeclan.example.character.*;
import com.codeclan.example.character.Character;
import com.codeclan.example.enemy.EnemyReward;
import com.codeclan.example.enemy.Orc;
import com.codeclan.example.mythical_creature.Dragon;
import com.codeclan.example.room.ChallengeRoom;
import com.codeclan.example.room.RewardRoom;
import com.codeclan.example.weapons.Potion;
import com.codeclan.example.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ChallengeRoomTest {
    private ChallengeRoom challengeRoom;
    private Sword sword;
    private Potion potion;
    private Dragon dragon;
    private Knight knight;
    private Wizard wizard;
    private ArrayList<Character> characters;
    private Orc orc;

    @Before
    public void before() {
        characters = new ArrayList<Character>();
        sword = new Sword("Stabby", 50, 50);
        potion = new Potion("Small Potion", 20, 10);
        dragon = new Dragon("Vulkanos", 75, 125);
        knight = new Knight("Panos The Great", 100, 50, 100, 20, 200);
        characters.add(knight);
        wizard = new Wizard("Ben The Wise", 100, 50, 20, 100);
        characters.add(wizard);
        orc = new Orc(50, 100, true, EnemyReward.MP);
        challengeRoom = new ChallengeRoom(characters, orc);
    }

    @Test
    public void enemyCanPayReward() {
        wizard.receiveDamage(90);
        orc.setAlive(false);
        challengeRoom.clearRoom();
        assertEquals(60, wizard.getHealth());
    }

    @Test
    public void canPrepForFight() {
        challengeRoom.prepForFight(sword, potion, Spells.FIREBALL, dragon);
        assertEquals(dragon, wizard.getSelectedCreature());
        assertEquals(Spells.FIREBALL, wizard.getSelectedSpell());
        assertEquals(sword, knight.getSelected());
    }


}