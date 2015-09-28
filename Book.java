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
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
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
    
    //Question 2.86 & 2.87
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        
        if (refNumber.length() > 0)
            System.out.println("Reference No. " +refNumber);
        else
            System.out.println("Reference No. ZZZ");
    }

}
