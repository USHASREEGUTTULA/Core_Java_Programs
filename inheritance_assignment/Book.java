package inheritance_assignment;

public class Book 
{
	public String title;
	public String author;
	public int pages;

	public boolean validateTitle(String title) 
    {
        if (title.length()>=3)
        {
            return true;
        }
        return false;
    }

	public boolean validateAuthor(String author) 
    {
        if (!author.trim().isEmpty()) 
        {
            return true;
        }
        return false;
    }

	public boolean validatePages(int pages) 
	{
        if (pages >10)
        {
            return true;
        }
        return false;
    }
	
	public void readPage(int pageNumber)
	{
        if (pageNumber > 0 && pageNumber <= pages) 
        {
            System.out.println("Reading page: " + pageNumber + " of " + title);
        }
        else
        {
            System.out.println("Invalid page number");
        }
    }
	
	public void bookmarkPage(int pageNumber) 
	{
        if (pageNumber > 0 && pageNumber <= pages) 
        {
            System.out.println("Bookmarked page: " + pageNumber + " in " + title);
        }
        else 
        {
            System.out.println("Invalid page number to bookmark");
        }
    }

	public void initialize(String title, String author, int pages)
    {
        if (validateTitle(title) && validateAuthor(author) && validatePages(pages)) 
        {
            this.title = title;
            this.author = author;
            this.pages = pages;
        } 
        else 
        {
            System.out.println("Invalid book details");
        }
    }

	public void displayBookInfo()
    {
        System.out.println("Title: " + title + ", Author: " + author + "Pages"+pages);
    }

}
