package lt.eif.viko.acizikovas.trecias.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *<h1>Band describing class</h1>
 * This is a class which describes the Band object.
 * @author Arnas
 */
@XmlRootElement(name="Band")
@XmlType(propOrder = {"id", "bandName", "memberCount", "bandActive"})
public class Band {

    private int id;
    private String bandName;
    private int memberCount;
    private boolean bandActive;

    public Band() {
    }

    /**
     *Get method to get the ID of a Band.
     * @return Returns the integer value of the Band id.
     */
    @XmlAttribute(name="Id")
    public int getId() {
        return id;
    }

    /**
     *Set method to set the ID for a new Band.
     * @param id This is the parameter to input for a new Band ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *Get method to obtain the Band name.
     * @return Returns the String value of the Band name.
     */
    @XmlElement(name="Name")
    public String getBandName() {
        return bandName;
    }

    /**
     *Set method to set the name for a new Band.
     * @param bandName This is the parameter to input for a new Band name.
     */
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    /**
     *Get method to get the value of a Band member count.
     * @return Returns the integer value of the member count.
     */
    @XmlElement(name="Members")
    public int getMemberCount() {
        return memberCount;
    }

    /**
     *Set method to set the number of members that belong in a new Band.
     * @param memberCount This is the parameter to input for a new Band name.
     */
    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    /**
     *Boolean method to get the value if the Band is active.
     * @return Returns  band activity in the form of boolean value.
     */
    @XmlElement(name="Activity")
    public boolean isBandActive() {
        return bandActive;
    }

    /**
     *Set method to set band activity for a new Band.
     * @param bandActive This is the parameter to input for a new Band activity.
     */
    public void setBandActive(boolean bandActive) {
        this.bandActive = bandActive;
    }

    /**
     *Method to resolve the value of isBandActive method.
     * @return Returns the String value which represents if the Band is "active" or "inactive".
     */
    public String resolveIsActive(){
        if(bandActive){
            return "active";
        } else {
            return "inactive";
        }
    }

    /**
     * A method which displays the values of a Band class.
     * @return Returns the String value of the Band object.
     */
    @Override
    public String toString() {
        return "Band: \nID: " + id +
                " " + bandName +
                " - currently " + memberCount +
                " members in the band and the band is " + resolveIsActive();
    }

}