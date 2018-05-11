-----------------------------------------------------------------------------------------------------------
CS140 - Introduction to Computing I
      p01 (Objects) - 50 pts
      
Due: 5:00 pm, Friday June 9, 2017
-----------------------------------------------------------------------------------------------------------
Electronic submission:
    - You must submit a single mp01.zip archive file of your project folder. Use a utility that produces
     .zip files (Windows: right click | Send to | compress, Mac: right click | compress).
    
    - Upload your file by the due date to classes.cs.siue.edu. No late assignments will be accepted, so
      allow at least 15 minutes before the due date for submission.
-----------------------------------------------------------------------------------------------------------
Objectives:
    - To gain experience with the BlueJ IDE and how to edit source code for a class. 
    - To create instances of the Book class and call its methods.
    - To inspect objects using the IDE.
    - To use simple if statements to validate the setter parameters.
-----------------------------------------------------------------------------------------------------------   
Project setup:
    You are provided with the Book class as your starting point. You will have to edit
    the source code (use the source editor for this) and make changes to it, as described
    below.
-----------------------------------------------------------------------------------------------------------    
Problem description:
    Your first mp is going to simply be the completion of the Book class and its testing.
    The Book class describes a single book and could be part of a larger publisher application
    that keeps track of its authors and the books they write.
-----------------------------------------------------------------------------------------------------------
Implementation details: 
    You are going to complete this class in steps, so here we go.
    
    (1) The first thing is to "clean up" the template that was created when the Book class was created.
    
    - Open the code editor (right click the class name, choose 'Open Editor') and update the
      comments at the top with your information, by replacing the parenthesized sample text.
      For example, your author line should be: * @author Socratis Tornaritis, replacing my name
      with yours of course.
      
    - Delete the only field currently in the class, x, and associated comment.
    
    - Delete the assignment (x = 0;) statement from within the constructor Book().
    
    - Delete the sampleMethod and associated comments. The entire yellow box basically.
    
    (2) Compile the class; create a new Book instance; inspect the object. Rather spartan right?
       
        - Can you explain why?
       
    (3) Add the three private fields.
        - Below the opening {, add the three fields that will represent the state of the object:
        
            private String title;
            private String author;
            private int copyrightYear;
          
    (4) Compile the class; create a new Book instance; inspect the object. 
    
        - Notice anything different this time around? Each field has been initialized by the 
          compiler with a default value appropriate for each type. The fields title and author 
          are String objects, which are reference types, thus are set to null (do not refer 
          to any object at this time). The copyrightYear is set to 0.
       
    (5) Initialize the fields inside the default constructor.
    
        - Although the compiler initializes an object's fields by default, it is better practice
          to do so yourselves within each of the constructors. Constructors are the primary means
          of initializing objects, so let's do that.
          
        - Edit the default constructor by adding three assignment statements, one for each of the
          three fields. Assign the exact same values as the compiler did.
          
    (6) Compile the class; create a new Book instance; inspect the object. 
    
        - You should get the exact same values as before (null, null, 0). If not, fix the issue
          before moving on, by editing the statements you wrote.
          
    (7) Add a three argument constructor.
    
        - To offer more initializing options, add a second constructor that will initialize the
          three fields with values supplied by a client (The code that is using your class. The
          IDE in our case).
          
        - Position the insertion cursor after the default constructor's } brace. 
          Select Edit | Insert Method from the menu. This will insert a new method template.
          
        - Update the method to look as follows:
        
            public Book(String theTitle, String theAuthor, int theCopyrightYear)
            {
            }
        
        - Now, add three assignment statements to initialize each field with the corresponding supplied
          parameter. This now offers a client of this object more control on how the object
          is initialized.
          
        - Update the comments to reflect the changes you made. You should have three @param
          entries, one for each parameter supplied. Remove the @return comment, since we are
          not returning a value.
          
    (8) Compile the class; create a new Book instance; inspect the object. 
    
        - Use the three argument constructor to initialize the object with values of your
          choosing. Caution: be mindful of how you provide the string values.
          
        - Inspection should now show the values you entered for the object. You could further
          inspect each of the string fields if you want, since these are objects remember.
          Try it out.
          
    (9) Add the three getter methods.
    
        - Each class should offer a means for clients to be able to read the state of the
          object. This is the main purpose of the following methods. Add three methods
          after the second constructor. Edit each to look as follows:
          
              public String getTitle() 
              {
              }
              public String getAuthor()
              {
              }
              public int getCopyright()
              {
              }
          
        - Update each method's comments appropriately.
        
        - Add a return statement in each method to return the corresponding field.
        
    (10) Compile the class; create a new Book instance; call each getter.
    
    (11) Add the three setter methods.
    
        - Each class should also offer a means for clients to be able to write or update the
          state of the object. This is the main purpose of the following methods. Add three methods
          after the getters. Edit each to look as follows:
          
            public void setTitle(String theTitle)
            {
            }
            public void setAuthor(String theAuthor)
            {
            }
            public void setCopyright(int theCopyrightYear)
            {
            }
          
        - Update each method's comments appropriately.
        
        - Add a single assignment statement in each method that sets the corresponding field.
        
    (12) Compile the class; create a new Book instance; inspect the object.
    
        - With the inspector window visible, call each setter and notice how the value of
          each field changes with each setter call.
          
    (13) Add a descriptor method to the class.
    
        - Add a new method after the setters. Edit the method to look as follows:
        
            @Override
            public String toString()
            {
            }
        
        - This method is the descriptor for the object, i.e. it describes the object. It returns
          a string representation of the object, formatted as follows:
          
            Title: <title>, Author: <author>, Year: <copyrightYear>
          
            Note: <title> represents the title field, but without the <>. Similarly for the other two.
          
            Here is an example of an actual description:
          
            Title: abc, Author: none, Year: 2017
          
    (14) Compile the class; create a new Book instance; call its descriptor.
    
        - Initialize the object with some values; this makes it more realistic.
        
        - Notice the string description shown in the dialog box after you call the method. Although
          this is fine for quick verification, let's produce a nicer output by using the Terminal
          window.
          
        - In the Code Pad panel (to the right of the bench), enter the following statement and
          press the <enter> key.
          
            System.out.println(book1);
          
        - Assuming you did not name the object when creating it, i.e. you accepted the default book1, this
          statement should produce a much more readable output. If your object name is different,
          then replace book1 with your chosen object name.
          
    (15) Validate values when setting the object.
    
        - Edit each of the setter methods to validate the parameter's value before updating the
          corresponding field. 
          
        - For the title and author values make sure that the parameter value
          is not empty before making the assignment. If it is, do not update the field and output
          a message to the Terminal.
          
            For the title, output "Title cannot be empty."
            For the author, output "Author cannot be empty."
          
            Update the @param comments to indicate that the value cannot be empty.
          
        - For the copyright year make sure the value is between 1800 and 2020 inclusive.
        
            For the copyrightYear, output "Invalid value: <theCopyrightYear>."
          
            Update the @param comment to indicate the valid range for the copyright year.
-----------------------------------------------------------------------------------------------------------
Grading Rubric:
    Program submitted late:                 -50
    Program does not compile:               -6
    
    Coding style:                            5
        variable names, comments,
        white space, readability
        
    (1) Clean-up:                            2
    (3) Fields:                              3
    (5) Default ctor:                        6
    (7) 3-arg ctor:                          6
    (9) Getters:                             6
    (11) Setters:                            6
    (13) Descriptor method:                  6
    (15) Parameter validation:              10
-----------------------------------------------------------------------------------------------------------