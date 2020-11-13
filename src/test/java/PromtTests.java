import Promt.Promt;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class PromtTests {

    @Test
    public void constructorTest() {
        Pet pet = new Pet();
        Prompt prompt = new Prompt();
        prompt.addPet(pet);
        ArrayList<Pet> list = prompt.getPets();
        Assert.assertTrue(list.contains(pet));
    }
    @Test
    public void promptCorrectNumberOfPetTest() {
        Prompt promptNumberOfPets = new Prompt();
        Integer userNumberOfPets = 3;
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(userNumberOfPets, promptNumberOfPets.getUserInput());
    }
    @Test
    public void promptCorrectPetTypeTest() {
        Prompt promptCorrectType = new Prompt();
        String userPetType = "Dog";
        String input = "Dog";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(userPetType, promptCorrectType.getUserInput());
    }
    @Test
    public void promptPetsNameTest() {
        Prompt promptPetName = new Prompt();
        String userPetName = "Nikki";
        String input = "Nikki";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Assert.assertEquals(promptPetName, promptPetName.getUserInput());
    }
}
