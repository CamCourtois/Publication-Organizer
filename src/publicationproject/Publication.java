
package publicationproject;

/**
 * TA: Maggie Stewart
 * @author cameroncourtois
 * Submitted at 7:45pm
 */

enum Genre {SCIENCE, ROMANCE, COMIC, CLASSIC, ATHLETIC, BEAUTY, FASHION, ENTERTAINMENT,THRILLER}
public class Publication implements Comparable <Publication>
{
    protected String title;
    protected int edition;
    protected int year;
    protected Genre genre;

    //creates a constructor initializing the attributes above
    public Publication(String pubTitle, int pubEdition, int pubYear, Genre pubGenre) {
        title = pubTitle;
        edition = pubEdition;
        year = pubYear;
        genre = pubGenre;
    }
    
    //prints the title, edition, and the year published
    public void printInfo()
    {
       System.out.println(title + ". Edition (" + edition + ") published in " + year);      
    }
    
    //prints a footer displaying all rights reserved
    public void printFooter()
    {
        System.out.println("All rights reserved.");
        System.out.println("--------------------");
    }
    
    //compares publications based off genres then title
    @Override
    public int compareTo(Publication other)
    {
        
        if(genre.name().compareTo(other.genre.name()) != 0)
            return genre.name().compareTo(other.genre.name());
        else 
            return title.compareToIgnoreCase(other.title);
    }
}
