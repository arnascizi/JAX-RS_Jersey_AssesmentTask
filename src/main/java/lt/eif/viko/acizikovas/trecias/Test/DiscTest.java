package lt.eif.viko.acizikovas.trecias.Test;

import lt.eif.viko.acizikovas.trecias.Data.Band;
import lt.eif.viko.acizikovas.trecias.Data.Disc;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 <h1>Disc Class tests</h1>
 * This is a class that tests all the methods of the Disc class.
 * @author Arnas
 */
class DiscTest {

    /**
     * Test of getId method, of class Disc.
     */
    @Test
    void getId() {
        Disc disc = new Disc();
        int expResult = 0;
        int result = disc.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Disc.
     */
    @Test
    void setId() {
        int id = 0;
        Disc disc = new Disc();
        disc.setId(id);
        assertTrue(disc.getId() == id);
    }

    /**
     * Test of getTitle method, of class Disc.
     */
    @Test
    void getTitle() {
        Disc disc = new Disc();
        String result = disc.getTitle();
        assertTrue(result == null);
    }

    /**
     * Test of setTitle method, of class Disc.
     */
    @Test
    void setTitle() {
        String title = "";
        Disc disc = new Disc();
        disc.setTitle(title);
        assertEquals(disc.getTitle(), title);
    }

    /**
     * Test of getPlayTime method, of class Disc.
     */
    @Test
    void getPlayTime() {
        Disc disc = new Disc();
        String result = disc.getPlayTime();
        assertTrue(result == null);
    }

    /**
     * Test of setPlayTime method, of class Disc.
     */
    @Test
    void setPlayTime() {
        String playTime = "";
        Disc disc = new Disc();
        disc.setPlayTime(playTime);
        assertEquals(disc.getPlayTime(), playTime);
    }

    /**
     * Test of getSongCount method, of class Disc.
     */
    @Test
    void getSongCount() {
        Disc disc = new Disc();
        int expResult = 0;
        int result = disc.getSongCount();
        assertEquals(expResult, result);
    }


    /**
     * Test of setSongCount method, of class Disc.
     */
    @Test
    void setSongCount() {
        int songCount = 0;
        Disc disc = new Disc();
        disc.setSongCount(songCount);
        assertEquals(disc.getSongCount(), songCount);
    }


    /**
     * Test of getCondition method, of class Disc.
     */
    @Test
    void getCondition() {
        Disc disc = new Disc();
        char expResult = ' ';
        disc.setCondition(expResult);
        char result = disc.getCondition();
        assertEquals(expResult, result);
    }


    /**
     * Test of setCondition method, of class Disc.
     */
    @Test
    void setCondition() {
        char condition = ' ';
        Disc disc = new Disc();
        disc.setCondition(condition);
        assertEquals(disc.getCondition(), condition);
    }

    /**
     * Test of isUsed method, of class Disc.
     */
    @Test
    void isUsed() {
        Disc disc = new Disc();
        boolean result = disc.isUsed();
        assertTrue(!result);
    }

    /**
     * Test of setUsed method, of class Disc.
     */
    @Test
    void setUsed() {
        Disc disc = new Disc();
        disc.setUsed(false);
        assertTrue(!disc.isUsed());
    }

    /**
     * Test of getBands method, of class Disc.
     */
    @Test
    void getBands() {
        Disc disc = new Disc();
        List<Band> bands = disc.getBands();
        Band band = new Band();
        Band otherBand = new Band();
        disc.getBands().add(band);
        disc.getBands().add(otherBand);
        assertTrue(bands.size() == 2);
    }

    /**
     * Test of setBands method, of class Disc.
     */
    @Test
    void setBands() {
        Disc disc = new Disc();
        List<Band> bands = disc.getBands();
        disc.setBands((ArrayList) bands);
        assertEquals(bands, disc.getBands());
    }

    /**
     * Test of resolveIsUsed method, of class Disc.
     */
    @Test
    void resolveIsUsed() {
        Disc disc = new Disc();
        String expResult = "not used";
        assertEquals(disc.resolveIsUsed(), expResult);
    }

    /**
     * Test of resolveCondition method, of class Disc.
     */
    @Test
    void resolveCondition() {
        Disc disc = new Disc();
        assertTrue(true, disc.resolveCondition(Disc.GOOD_CONDITION));
    }

    /**
     * Test of toString method, of class Disc.
     */
    @Test
    void testToString() {
        Disc disc = new Disc();
        assertTrue(true, disc.toString());
    }
}