package lt.eif.viko.acizikovas.trecias.Test;

import lt.eif.viko.acizikovas.trecias.Data.Disc;
import lt.eif.viko.acizikovas.trecias.Repository.DiscRepository;
import lt.eif.viko.acizikovas.trecias.Repository.DiscRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *<h1>DiscRepository Class tests</h1>
 * This is a class that tests all the methods of the DiscRepository class.
 * @author Arnas
 */
class DiscRepositoryImplTest {

    /**
     * Test of fetchAllDiscs method, of class DiscRepositoryImpl.
     */
    @Test
    void fetchAllDiscs() {
        DiscRepository repoTest = new DiscRepositoryImpl();
        assertEquals(repoTest.fetchAllDiscs().size(), 3);
    }

    /**
     * Test of findOneDisc method, of class DiscRepositoryImpl.
     */
    @Test
    void findOneDisc() {
        int id = 1;
        String name = "Metallica";
        DiscRepository repoTest = new DiscRepositoryImpl();
        assertEquals(repoTest.findOneDisc(id).getTitle(), name);
    }

    /**
     * Test of updateDisc method, of class DiscRepositoryImpl.
     */
    @Test
    void updateDisc() {
        DiscRepository repoTest = new DiscRepositoryImpl();
        Disc newDisc = new Disc();
        newDisc.setId(2);
        newDisc.setSongCount(15);
        repoTest.updateDisc(newDisc);
        assertTrue(repoTest.findOneDisc(2).getSongCount()== 15);
    }

    /**
     * Test of deleteDisc method, of class DiscRepositoryImpl.
     */
    @Test
    void deleteDisc() {
        Disc disc = new Disc();
        disc.setId(6);
        int id = 6;
        DiscRepository repoTest = new DiscRepositoryImpl();
        repoTest.deleteDisc(id);
        assertEquals(repoTest.fetchAllDiscs().contains(id), false);
    }
}