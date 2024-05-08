package lukas.week07.ZooSimulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {


    @Test
    public void testBiteDeadly() {
        //prepare
        Animal aggressor = new Animal(
                "aggressor",
                "predator",
                new Food("Food1", Food.Unit.KILOGRAMM, 100),
                200,
                100,
                30);
        Animal victim = new Animal(
                "victim",
                "ant",
                new Food("Food2", Food.Unit.GRAMM, 1),
                1,
                3,
                1);

        //test
        int iCount = 0;
        while (victim.getCurrentHealth() > 0) {
            aggressor.bites(victim, 10);
            iCount++;
        }
        //evaluate
        System.out.printf("beißt nach %d Versuchen (Victim Health: %d%n", iCount, victim.getCurrentHealth());
        assertTrue(victim.getCurrentHealth() <= 0);

    }

    @Test
    public void testBiteNotAggressive() {
        //prepare
        Animal aggressor = new Animal(
                "aggressor",
                "predator",
                new Food("Food1", Food.Unit.KILOGRAMM, 100),
                200,
                100,
                30);

        Animal victim = new Animal(
                "victim",
                "ant",
                new Food("Food2", Food.Unit.GRAMM, 1),
                1,
                3,
                1);

        aggressor.setAggressive(false);
        int oldVictimHealth = victim.getCurrentHealth();

        //test
        for (int i = 0; i < 1000; i++) {
            aggressor.bites(victim, 10);
        }
        //evaluate
        assertEquals(oldVictimHealth, victim.getCurrentHealth());

    }

    @Test
    public void testBiteVictimDeath() {
        //prepare
        Animal aggressor = new Animal(
                "aggressor",
                "predator",
                new Food("Food1", Food.Unit.KILOGRAMM, 100),
                200,
                100,
                30);

        Animal victim = new Animal(
                "victim",
                "ant",
                new Food("Food2", Food.Unit.GRAMM, 1),
                1,
                3,
                1);

        victim.setCurrentHealth(-1);
        //test
        for (int i = 0; i < 1000; i++) {
            aggressor.bites(victim, 10);
        }
        //evaluate
        assertEquals(-1, victim.getCurrentHealth());

    }

    @Test
    public void testBiteAggressorDeath() {
        //prepare
        Animal aggressor = new Animal(
                "aggressor",
                "predator",
                new Food("Food1", Food.Unit.KILOGRAMM, 100),
                200,
                100,
                30);
        Animal victim = new Animal(
                "victim",
                "ant",
                new Food("Food2", Food.Unit.GRAMM, 1),
                1,
                3,
                1);
        aggressor.setCurrentHealth(-1);
        int oldVictimHealth = victim.getCurrentHealth();
        //test
        for (int i = 0; i < 1000; i++) {
            aggressor.bites(victim, 10);
        }
        //evaluate
        assertEquals(oldVictimHealth, victim.getCurrentHealth());
    }

    @Test
    public void testBiteAggressorIsInTreatment() {
        //TODO: Test hier für die Fische, wird in Enclosure getListOfPossibleVictimsFor abgefragt
        //prepare
        Animal aggressor = new Animal(
                "aggressor",
                "predator",
                new Food("Food1", Food.Unit.KILOGRAMM, 100),
                200,
                100,
                30);
        Animal victim = new Animal(
                "victim",
                "ant",
                new Food("Food2", Food.Unit.GRAMM, 1),
                1,
                3,
                1);
        aggressor.setInTreatmentAtMoment(true);
        int oldVictimHealth = victim.getCurrentHealth();
        //test
        for (int i = 0; i < 1000; i++) {
            aggressor.bites(victim, 10);
        }
        //evaluate
        assertEquals(oldVictimHealth, victim.getCurrentHealth());
    }

    @Test
    public void testBiteVictimIsInTreatment() {
        //TODO: Test hier für die Fische, wird in Enclosure getListOfPossibleVictimsFor abgefragt
        //prepare
        Animal aggressor = new Animal(
                "aggressor",
                "predator",
                new Food("Food1", Food.Unit.KILOGRAMM, 100),
                200,
                100,
                30);
        Animal victim = new Animal(
                "victim",
                "ant",
                new Food("Food2", Food.Unit.GRAMM, 1),
                1,
                3,
                1);
        victim.setInTreatmentAtMoment(true);
        int oldVictimHealth = victim.getCurrentHealth();
        //test
        for (int i = 0; i < 1000; i++) {
            aggressor.bites(victim, 10);
        }
        //evaluate
        assertEquals(oldVictimHealth, victim.getCurrentHealth());
    }



}
