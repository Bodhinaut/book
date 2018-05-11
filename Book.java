
/** Kyle M. Shive
 * Lab 1
 * 6/01/2017
 * CS140-001
 * Socratis Tornaritis
 */
public class Book {
    private String title;
    private String author;
    private int copyrightYear;
    

    /**
     * Constructor for objects of class Book
     */
    public Book() {
        title = null;
        author = null;
        copyrightYear = 0;
    
    }

    /** 
     * @ param - Three assignment states were added to initialize the created fields with the corresponding 
     * parameter
     */
    public Book (String theTitle, String theAuthor, int theCopyrightYear) {
        title = theTitle;
        author = theAuthor;
        copyrightYear =theCopyrightYear;
        
    }
    
    /** The following methods offer a means for clients to be able to read the state of the 
     * object
     */
    
    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public int getCopyrightYear() {
        return this.copyrightYear;
    } 
    /**return methods above return the corresponding field */
    
    
    
    /** The following three methods allow the client to write or update the state
     * of the object
     */
    
    public void setTitle(String theTitle) {
        
        if (theTitle.equals ("")) {
            System.out.println("Title cannot be empty.");
        
        }else{
            this.title = theTitle;
            System.out.println(theTitle);
        
        }  
    }
    /** @param above cannot be empty */
    // do I need an else statment below??
    
    public void setAuthor(String theAuthor) {
        if (theAuthor.equals ("")) {
            System.out.println("Author cannot be empty.");
        }else{
        this.author = theAuthor;
        System.out.println(theAuthor);
    }   
   }
    /** @param above cannot be empty */
    
    public void setCopyrightYear(int theCopyrightYear) {
        if (theCopyrightYear <1800 || theCopyrightYear >2020) {
            System.out.println("Invalid value: " + theCopyrightYear + ".");
            
        }else{ 
            this.copyrightYear = theCopyrightYear;
            System.out.println(theCopyrightYear);
              
            }     
            
        
    }    
    /** @parameter above cannot be less than 1800 or more than 2020 */
    
    /**
     * The following is the descriptor method for the class
     */
    @Override
    public String toString() {
        return ("Title:" + " " + title + "," + " " + "Author:" + " " + author + "," +
        " " + "Year:" + " " + copyrightYear);
    }

    
    
   
}

