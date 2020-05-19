package lt.eif.viko.acizikovas.trecias.Repository;

import lt.eif.viko.acizikovas.trecias.Data.Band;
import lt.eif.viko.acizikovas.trecias.Data.Disc;

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>Disc repository interface</h1>
 *   An implementation of DiscRepository interface with the CRUD operations on the repository.
 *   @author Arnas
 */
@XmlRootElement(name = "DiscRepository")
public class DiscRepositoryImpl implements DiscRepository {

    @XmlElementWrapper(name="DiscList")
    @XmlElement(name="Disc")
    private static List<Disc> discs = new LinkedList<>();

    static {
        Band metallica = new Band();
        metallica.setId(1);
        metallica.setBandName("Metallica");
        metallica.setMemberCount(4);
        metallica.setBandActive(true);

        Disc metallicaM = new Disc();
        metallicaM.setId(1);
        metallicaM.setTitle("Metallica");
        metallicaM.setPlayTime("66:38");
        metallicaM.setSongCount(12);
        metallicaM.setUsed(false);
        metallicaM.setCondition('G');
        metallicaM.getBands().add(metallica);

        Band blackSabbath = new Band();
        blackSabbath.setId(2);
        blackSabbath.setBandName("Black sabbath");
        blackSabbath.setMemberCount(3);
        blackSabbath.setBandActive(false);

        Disc ironManBS = new Disc();
        ironManBS.setId(2);
        ironManBS.setTitle("Iron Man");
        ironManBS.setPlayTime("59:32");
        ironManBS.setSongCount(11);
        ironManBS.setUsed(true);
        ironManBS.setCondition('B');
        ironManBS.getBands().add(blackSabbath);

        Band venom = new Band();
        venom.setId(3);
        venom.setBandName("Venom");
        venom.setMemberCount(4);
        venom.setBandActive(false);

        Disc welcomeToHellV = new Disc();
        welcomeToHellV.setId(3);
        welcomeToHellV.setTitle("Welcome to hell");
        welcomeToHellV.setPlayTime("48:52");
        welcomeToHellV.setSongCount(9);
        welcomeToHellV.setUsed(false);
        welcomeToHellV.setCondition('G');
        welcomeToHellV.getBands().add(venom);

        discs.add(metallicaM);
        discs.add(ironManBS);
        discs.add(welcomeToHellV);

    }

    /**
     *A method which gets all the Discs in the repository.
     * @return Returns all the Discs with description from repository.
     */
    @Override
    public List<Disc> fetchAllDiscs() {
        return discs;
    }

    /**
     *A method used to find a single Disc.
     * @param id This is the value used in order to find a single Disc.
     * @return Returns a detailed description of the Disc and Bands that are associated
     * with the Disc.
     */
    @Path("/{id}")
    @Override
    public Disc findOneDisc(int id) {
        for(Disc disc: discs){
            if(disc.getId() == id){
                return disc;
            }
        }
        return null;
    }

    /**
     *A method used to update the Disc object.
     * @param disc This is the parameter used in order to update the Disc object.
     */
    @Override
    public void updateDisc(Disc disc) {
        for (Disc disc1 : discs) {
            if(disc.getId() == disc1.getId()){
                discs.set(discs.indexOf(disc1), disc);
            }
        }
    }

    /**
     *A method to delete a Disc from the Repository.
     * @param id This is the parameter needed to invoke the Disc deletion from the repository.
     */
    @Override
    public void deleteDisc(int id) {
        discs.removeIf(disc -> disc.getId() == id);
    }
}
