
package publicationproject;

/**
 * TA: Maggie Stewart
 * @author cameroncourtois
 * Submitted at 7:45pm
 */
public class Book extends Publication 
{
    private String author;

    //creates a constructor for book and instantiates the parent attributes and one above
    public Book(String bookAuthor, String pubTitle, Genre genre, int pubEdition, int pubYear) 
    {
        super(pubTitle, pubEdition, pubYear, genre);
        author = bookAuthor;
    }
    //prints the previous header and footer, with the given text below in between
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println(genre + " book by " + author);
        super.printFooter();
    }
    
    
    
}
