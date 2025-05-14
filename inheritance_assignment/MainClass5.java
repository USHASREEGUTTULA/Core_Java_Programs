package inheritance_assignment;

public class MainClass5 
{
	public static void main(String[] args) {
        Surgeon s = new Surgeon();
        s.initializePerson("Dr. Smith", 45);
        s.initializeDoctor("Cardiology", 20);
        s.initializeSurgeon("Heart Surgery", 98.5);
        s.displaySurgeonInfo();
        
        s.diagnosePatient();
        s.prescribeMedicine();
        s.performSurgery("John Doe");
        s.updateSuccessRate(99.2);
       
    }

}
