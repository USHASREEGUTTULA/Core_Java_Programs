package inheritance_assignment;

public class Ebook extends Book
{
	public double fileSize;
	public String format;

	public boolean validateFileSize(double fileSize)
	{
        if (fileSize > 0.5) 
        {
            return true;
        }
        return false;
    }


	public boolean validateFormat(String format)
	{
        if (format.equals("PDF") || format.equals("EPUB") || format.equals("MOBI"))
        {
            return true;
        }
        return false;
    }

	public void setEbookDetails(double fileSize, String format) 
	{
        if (validateFileSize(fileSize) && validateFormat(format)) 
        {
            this.fileSize = fileSize;
            this.format = format;
        } 
        else 
        {
            System.out.println("Invalid digital book details");
        }
    }
    
	public void convertFormat(String newFormat)
	{
        if (validateFormat(newFormat)) 
        {
            System.out.println("Converting " + title + " from " + format + " to " + newFormat);
            this.format = newFormat;
        } 
        else
        {
            System.out.println("Invalid format conversion");
        }
    }
	
	public void downloadBook() 
	{
        System.out.println("Downloading " + title + " in " + format + " format...");
    }
	
	 public void displayEbookInfo() 
	 {
	        displayBookInfo();
	        System.out.println("File Size: " + fileSize + " MB, Format: " + format);
	 }
}
