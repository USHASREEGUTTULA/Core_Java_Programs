package inheritance_assignment;

public class MainClass2 
{
	public static void main(String[] args) 
	{
        AudioBook myBook = new AudioBook();
        
        myBook.initialize("Effective Java", "Joshua Bloch", 2008);
        myBook.setEbookDetails(10, "PDF");
        myBook.setAudiobookDetails("John Doe", 600);
        
        
        myBook.displayBookInfo();
        myBook.readPage(100);
        myBook.bookmarkPage(200);
        myBook.downloadBook();
        myBook.convertFormat("EPUB");
        myBook.playAudiobook();
        myBook.adjustSpeed(1.5);
    }

}
