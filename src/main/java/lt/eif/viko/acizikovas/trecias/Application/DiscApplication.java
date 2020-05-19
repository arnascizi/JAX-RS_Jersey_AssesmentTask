package lt.eif.viko.acizikovas.trecias.Application;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *<h1>Disc application class</h1>
 * This is a class that describes the base application URI and used resource classes for the web api.
 * @author Arnas
 */
@ApplicationPath("discapi")
public class DiscApplication extends Application {

    /**
     * Method used to add classes for the REST web application
     * @return Returns the web application resources class.
     */
    @Override
    public Set<Class<?>> getClasses() {
        HashSet hs = new HashSet<Class<?>>();
        hs.add(DiscService.class);
        return hs;
    }
}
