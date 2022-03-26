
package publicationproject;
import java.util.ArrayList;
import java.util.Collections;

/**
 * TA: Maggie Stewart
 * @author cameroncourtois
 * Submitted at 7:45pm
 */
public class PublicationProject {

    //adds publications to the arraylist and sorts them based off genre and then
    // title, and displays them in console menu
    public static void main(String[] args) 
    {
        ArrayList<Publication> pubs = new ArrayList<>();
        pubs.add(new Book("John Carreyrou", "Bad Blood: Secrets and Lies in a Silicon Valley Startup",
        Genre.THRILLER, 1, 2018));
        pubs.add(new Book("Andriy Burkov", "The Hundred-Page Machine Learning Book", Genre.SCIENCE, 1,
        2019));
        pubs.add(new Magazine("Meredith Corporation", "Sports Illustrated", Genre.ATHLETIC, 633, 2020));
        pubs.add(new Magazine("Meredith Corporation", "People", Genre.ENTERTAINMENT, 466, 2020));

        Collections.sort(pubs);
        for(Publication p : pubs)
        p.printInfo();
    }
    
}
