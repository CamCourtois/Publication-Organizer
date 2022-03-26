
package publicationproject;

/**
 * TA: Maggie Stewart
 * @author cameroncourtois
 * Submitted at 7:45pm
 */
public class Magazine extends Publication 
{
    private String publisher;

    //creates an instance of the class Magazine
    public Magazine(String magPublisher, String pubTitle, Genre genre, int pubEdition, int pubYear) 
    {
        super(pubTitle, pubEdition, pubYear, genre);
        publisher = magPublisher;
    }
    
    //prints the parent header and footer, with the text below in between
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println(genre + " magazine by "+publisher+".");
        super.printFooter();

    }
    
}
