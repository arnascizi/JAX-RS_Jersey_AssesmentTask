package lt.eif.viko.acizikovas.trecias.Application;

import lt.eif.viko.acizikovas.trecias.Data.Disc;
import lt.eif.viko.acizikovas.trecias.Repository.DiscRepository;
import lt.eif.viko.acizikovas.trecias.Repository.DiscRepositoryImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 *<h1>DiscService class</h1>
 * This is the main web application service class. It is used to describe the methods
 * used to access the web api.
 * @author Arnas
 */
@Path("discs")
public class DiscService {

    DiscRepository repository = new DiscRepositoryImpl();

    /**
     * Methods used to get all the items in the repository as XML.
     * @return Returns a list of all the Discs in the repository.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Disc> getAllDisc(){
        return repository.fetchAllDiscs();
    }

    /**
     * Method to obtain one certain instance of Disc object from the repository as XML.
     * @param id A value which is used to find a specific Disc object by it's ID.
     * @return Returns one Disc object from the repository.
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Disc findOneDisc(@PathParam("id") int id){
        return repository.findOneDisc(id);
    }

    /**
     * Method to update specific Disc object in the repository as XML.
     * @param id A value which indicates the ID of the Disc object to update.
     * @param disc Disc object with updated values.
     */
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public void updateDisc(@PathParam("id") int id, Disc disc) {
        disc.setId(id);
        repository.updateDisc(disc);
    }

    /**
     * Method that deletes specific Disc object from the repository as XML.
     * @param id Value used to find the specific Disc object for deletion.
     */
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public void deleteDisc(@PathParam("id") int id){
        repository.deleteDisc(id);
    }
}
