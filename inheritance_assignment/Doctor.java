package inheritance_assignment;

public class Doctor extends Person
{
	public String specialization;
    public int experience;
    
    public boolean validateSpecialization(String specialization) 
    {
        if (!specialization.isEmpty()) 
        {
            return true;
        }
        return false;
    }
    
    public boolean validateExperience(int experience)
    {
        if (experience >= 0) 
        {
            return true;
        }
        return false;
    }
    public void diagnosePatient() 
    {
        System.out.println(name + " is diagnosing a patient.");
    }
    
    public void prescribeMedicine()
    {
        System.out.println(name + " is prescribing medicine.");
    }
    
    public void initializeDoctor(String specialization, int experience)
    {
        if (validateSpecialization(specialization) && validateExperience(experience)) 
        {
            this.specialization = specialization;
            this.experience = experience;
        } 
        else
        {
            System.out.println("Invalid doctor details");
        }
    }
    
    public void displayDoctorInfo() 
    {
        displayPersonInfo();
        System.out.println("Specialization: " + specialization + ", Experience: " + experience + " years");
    }
}
