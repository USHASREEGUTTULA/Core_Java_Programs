package inheritance_assignment;

public class SmartPhone extends Electronics
{
	public int ram;
    public int storage;
    public int cameraQuality;

    // Validation Methods
    public boolean validateRAM(int ram) 
    {
        if (ram >= 2) 
        {
            return true;
        }
        return false;
    }

    public boolean validateStorage(int storage) 
    {
        if (storage >= 16) 
        {
            return true;
        }
        return false;
    }

    public boolean validateCameraQuality(int cameraQuality) 
    {
        if (cameraQuality >= 1 && cameraQuality <= 100)
        {
            return true;
        }
        return false;
    }

    // Initialize Smartphone
    public void initializeSmartphone(int ram, int storage, int cameraQuality) 
    {
        if (validateRAM(ram) && validateStorage(storage) && validateCameraQuality(cameraQuality)) 
        {
            this.ram = ram;
            this.storage = storage;
            this.cameraQuality = cameraQuality;
        } 
        else 
        {
            System.out.println("Invalid smartphone details!");
        }
    }

    // Capture Photo
    public String capturePhoto(String mode) 
    {
        String photoStatus = "Photo captured in " + mode + " mode";
        return photoStatus;
    }

    // Install App
    public String installApp(String appName) 
    {
        String installStatus = appName + " installed successfully";
        return installStatus;
    }

    // Display Smartphone Details
    public void displaySmartphone() 
    {
        displayElectronics();
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Camera Quality: " + cameraQuality + " MP");
    }
}
