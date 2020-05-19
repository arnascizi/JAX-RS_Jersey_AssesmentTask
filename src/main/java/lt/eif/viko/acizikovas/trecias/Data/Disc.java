package lt.eif.viko.acizikovas.trecias.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 *<h1>Disc describing class.</h1>
 * This is a class which describes the Disc object.
 * @author Arnas
 */

@XmlRootElement(name="Disc")
@XmlType(propOrder = {"id", "title", "playTime", "songCount", "condition", "used", "bands"})
public class Disc {

    /**
     *A static Character value which describes a Good Condition.
     */
    public static final char GOOD_CONDITION = 'G';

    /**
     *A static Character value which describes a Bad Condition.
     */
    public static final char BAD_CONDITION = 'B';

    private int id;
    private String title;
    private String playTime;
    private int songCount;
    private char condition;
    private boolean used;
    private ArrayList bands = new ArrayList();

    /**
     *Get method to get the value of the Disc ID
     * @return Returns integer value of the Disc ID.
     */
    @XmlAttribute(name="Id")
    public int getId() {
        return id;
    }

    /**
     *Set method to set an ID for the new Disc.
     * @param id This is the value used to enter the Disc ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *Get method to get the Disc title value.
     * @return Returns String value of the Disc title.
     */
    @XmlElement(name="Title")
    public String getTitle() {
        return title;
    }

    /**
     *Set method used to set title for the new Disc.
     * @param title This is the value used to enter the Disc Title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *Get method to obtain the String value for the Disc play duration.
     * @return Returns String value for the Disc play duration time.
     */
    @XmlElement(name="Time")
    public String getPlayTime() {
        return playTime;
    }

    /**
     *Set method used to set a play duration for a new Disc.
     * @param playTime This is the value used to enter the Disc play time.
     */
    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    /**
     *Get method used to get the value of the song count in the Disc.
     * @return Returns integer value of the Disc song count.
     */
    @XmlElement(name="SongCount")
    public int getSongCount() {
        return songCount;
    }

    /**
     *Set method used to set a song count value for the new Disc.
     * @param songCount This is the value used to enter the Disc song count.
     */
    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    /**
     *Get method that is described in one letter which represents the Disc condition.
     * @return Returns character which represents the Disc condition.
     */
    @XmlElement(name="Condition")
    public char getCondition() {
        return condition;
    }

    /**
     *Set method to set a condition value for the new Disc.
     * @param condition This is the value used to enter the Disc condition.
     */
    public void setCondition(char condition) {
        this.condition = condition;
    }

    /**
     *Get method which describes if the Disc is used or not.
     * @return Returns boolean value of true or false.
     */
    @XmlElement(name="Used")
    public boolean isUsed() {
        return used;
    }

    /**
     *Set method to set a used value for the new Disc.
     * @param used This is the value used to enter the Disc usage.
     */
    public void setUsed(boolean used) {
        this.used = used;
    }

    /**
     *Get method to get the list of all the bands associated with the Disc.
     * @return Returns a list of the Bands.
     */
    @XmlElementWrapper(name="BandList")
    @XmlElement(name="Band")
    public List<lt.eif.viko.acizikovas.trecias.Data.Band> getBands() {
        return bands;
    }

    /**
     *Sets method to set a Band to the list associated with the Disc.
     * @param bands This is the value which is used to enter the value for the new Band.
     */
    public void setBands(ArrayList bands) {
        this.bands = bands;
    }

    /**
     *A method which is used to describes if Disc is used or not.
     * @return Returns String value which indicates "used" or "not used".
     */
    public String resolveIsUsed(){
        if(used){
            return "used";
        } else {
            return "not used";
        }
    }

    /**
     * A method which prints out every Band in the list associated with the Disc.
     * @return Returns String value that describes every Band.
     */
    private String resolveBands(){
        StringBuilder result = new StringBuilder();
        for(Object band: bands) {
            result.append(band);
        }
        return result.toString();
    }

    /**
     *A method used to replace the constant character value with the String value
     * which represents the Disc condition.
     * @param condition This is the parameter used to describe the Disc in one letter.
     * @return Returns String value which represents G - good, B - bad or returns empty string.
     */
    public String resolveCondition(char condition){
        if (condition == GOOD_CONDITION){
            return "good";
        } else if (condition == BAD_CONDITION){
            return "bad";
        } else {
            return "";
        }
    }

    /**
     * A method which prints out the Disc object description with all it's values.
     * @return String value of the Disc object.
     */
    @Override
    public String toString(){
        return  "\nDisc: \nID: " + id +" " + title + " - Play Time: " + playTime +
                " minutes and there are " + songCount + " songs in the disc " +
                ". \nThe disc is in a " + resolveCondition(condition) +
                " condition, currently the disc is " + resolveIsUsed() +
                " \nMade by " + resolveBands();
    }
}
