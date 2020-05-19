package lt.eif.viko.acizikovas.trecias.Repository;

import lt.eif.viko.acizikovas.trecias.Data.Disc;

import java.util.List;

/**
 *<h1>Disc repository interface</h1>
 * An interface with the CRUD operations on the repository.
 * @author Arnas
 */
public interface DiscRepository {

    /**
     *A method which gets all the Discs in the repository.
     * @return Returns all the Discs with description from repository.
     */
    List<Disc> fetchAllDiscs();

    /**
     *A method used to find a single Disc.
     * @param id This is the value used in order to find a single Disc.
     * @return Returns a detailed description of the Disc and Bands that are associated
     * with the Disc.
     */
    Disc findOneDisc(int id);

    /**
     *A method used to update the Disc object.
     * @param disc This is the parameter used in order to update the Disc object.
     */
    void updateDisc(Disc disc);

    /**
     *A method to delete a Disc from the Repository.
     * @param id This is the parameter needed to invoke the Disc deletion from the repository.
     */
    void deleteDisc(int id);
}
