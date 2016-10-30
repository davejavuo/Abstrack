package cmsc179.abstrack;

/**
 * Created by justine_navaja on 10/17/2016.
 */
public class Shakespeare {
    String versionName;
    String versionNumber;
    int image; // drawable reference id

    public Shakespeare(String vName, String vNumber, int image)
    {
        this.versionName = vName;
        this.versionNumber = vNumber;
        this.image = image;
    }

    public static final String DIALOGUE[] =  {"My Desdemona must I leave to thee", "Wherefore art thou, Oh Romeo!", "To be or not to be? That is the question.", "Your children shall be kings."};

}