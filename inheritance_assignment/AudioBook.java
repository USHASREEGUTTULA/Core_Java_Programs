package inheritance_assignment;

public class AudioBook extends Ebook
{
	public String narrator;
	public int duration;

	public boolean validateNarrator(String narrator)
	{
        if (narrator.length() >= 2) 
        {
            return true;
        }
        return false;
    }

	public boolean validateDuration(int duration) 
	{
        if (duration > 0 && duration >5)
        {
            return true;
        }
        return false;
    }

	public void setAudiobookDetails(String narrator, int duration) 
	{
        if (validateNarrator(narrator) && validateDuration(duration)) 
        {
            this.narrator = narrator;
            this.duration = duration;
        } 
        else 
        {
            System.out.println("Invalid audiobook details");
        }
    }

	public void adjustSpeed(double speed) 
	{
        if (speed >= 0.5 && speed <= 3.0) 
        {
            System.out.println("Adjusting playback speed to " + speed + "x");
        } 
        else 
        {
            System.out.println("Invalid speed setting");
        }
    }
	
	public void playAudiobook() 
	{
        System.out.println("Playing audiobook: " + title + " narrated by " + narrator);
    }
	
	public  void displayAudiobookInfo() 
	{
	        displayEbookInfo();
	        System.out.println("Narrator: " + narrator + ", Duration: " + duration + " minutes");
	    }

}
