package lt.eif.viko.acizikovas.trecias.Test;

import lt.eif.viko.acizikovas.trecias.Data.Band;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *<h1>Band Class tests</h1>
 * This is a class that tests all the methods of the Band class.
 * @author Arnas
 */
class BandTest {

    /**
     * Test of getId method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void getId() {
        Band band = new Band();
        int expResult = 0;
        int result = band.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void setId() {
        int id = 0;
        Band band = new Band();
        band.setId(id);
        assertEquals(band.getId(), id);
    }

    /**
     * Test of getBandName method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void getBandName() {
        System.out.println("getBandName");
        Band band = new Band();
        band.setBandName(" ");
        String expResult = " ";
        String result = band.getBandName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandName method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void setBandName() {
        String bandName = "";
        Band band = new Band();
        band.setBandName(bandName);
        assertEquals(band.getBandName(), bandName);
    }

    /**
     * Test of getMemberCount method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void getMemberCount() {
        Band band = new Band();
        int expResult = 0;
        int result = band.getMemberCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMemberCount method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void setMemberCount() {
        int memberCount = 0;
        Band band = new Band();
        band.setMemberCount(memberCount);
        assertEquals(band.getMemberCount(), memberCount);
    }

    /**
     * Test of isBandActive method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void isBandActive() {
        Band band = new Band();
        boolean expResult = false;
        boolean result = band.isBandActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandActive method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void setBandActive() {
        boolean bandActive = false;
        Band band = new Band();
        band.setBandActive(bandActive);
        assertEquals(band.isBandActive(), bandActive);
    }

    /**
     * Test of resolveIsActive method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void resolveIsActive() {
        Band band = new Band();
        String expResult = "inactive";
        String result = band.resolveIsActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Band.
     */
    @org.junit.jupiter.api.Test
    void testToString() {
        System.out.println("toString");
        Band band = new Band();
        String expResult = "Band: \n" +
                "ID: " + band.getId() +
                " " + band.getBandName() +
                " - currently "+ band.getMemberCount() +
                " members in the band and the band is "+ band.resolveIsActive();
        String result = band.toString();
        assertEquals(expResult, result);
    }
}