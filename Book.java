/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Jennifer Puhalka
 * @version September 21, 2015
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages = 0;
    private int borrowed = 0;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = (" ");
    }
    
    //Question 2.83
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    //Question 2.85
    public int getPages()
    {
        return pages;
    }
    
    //Question 2.87
    public String getRefNumber()
    {
        return refNumber;
    }
    
    //Question 2.90
    public int getBorrowed()
    {
        return borrowed;
    }
    
    //Question 2.89
    public void setRefNumber(String ref)
    {
        if (ref.length() < 3)
            System.out.println("Error: Reference Number must contain at least 3 digits.");
        else
            refNumber = ref;
    }
    
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
     
    //Question 2.84
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    //Question 2.86 & 2.87 & 2.90
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        
        if (refNumber.length() > 0)
            System.out.println("Reference No. " +refNumber);
        else
            System.out.println("Reference No. ZZZ");
            
        System.out.println("This book been borrowed " + borrowed + " time(s)");
    }

}
