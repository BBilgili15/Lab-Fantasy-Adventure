import com.codeclan.example.character.Character;
import com.codeclan.example.character.Knight;
import com.codeclan.example.character.Wizard;
import com.codeclan.example.room.RewardRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class RewardRoomTest {
    private RewardRoom rewardRoom;
    private Knight knight;
    private Wizard wizard;
    private ArrayList<Character> characters;

    @Before
    public void before() {
        characters = new ArrayList<Character>();
        knight = new Knight("Panos The Great", 100, 50, 100, 20, 200);
        characters.add(knight);
        wizard = new Wizard("Ben The Wise", 100, 50, 20, 100);
        characters.add(wizard);
        rewardRoom = new RewardRoom(characters, 100);
    }

    @Test
    public void canPayReward() {
        rewardRoom.openChest();
        assertEquals(50, wizard.getWallet());
        assertEquals(50, knight.getWallet());
        assertEquals("All characters received 50 gems.", rewardRoom.openChest());
    }
}
