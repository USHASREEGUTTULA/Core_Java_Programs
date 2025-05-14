package inheritance_assignment;

public class Manager extends Employee
{
	public int teamSize;
    public int projectCount;

    public boolean validateTeamSize(int teamSize) 
    {
      
        if (teamSize >= 1) 
        {
            return true;
        }
        return false;
    }

    public boolean validateProjectCount(int projectCount) 
    {
       if(projectCount >= 1)
       {
           return true;
       }
       return false;
    	   
    }

    public void initializeManager(int teamSize, int projectCount)
    {
        if (validateTeamSize(teamSize) && validateProjectCount(projectCount)) 
        {
            this.teamSize = teamSize;
            this.projectCount = projectCount;
        } 
        else 
        {
            System.out.println("Invalid Manager Details");
        }
    }

    public void assignTask(String taskName, Employee employee) 
    {
        System.out.println("Assigned task: " + taskName + " to " + employee.name);
    }

    public void evaluateEmployee(Employee employee, int rating)
    {
        System.out.println("Evaluating " + employee.name + " with rating: " + rating);
    }
}
